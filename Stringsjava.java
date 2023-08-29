import java.util.Scanner;
import java.util.*;

public class Stringsjava {
    //java strings are immutable
    public static void strio(String name){
        Scanner sc = new Scanner(System.in);
        name = sc.nextLine();
        System.out.println(name);
    }
    public static void strlen(){
        String firstname = "Ajay";
        String lastname = "Rathod ";
        String fullname = firstname +" "+lastname;
        System.out.println(fullname.length());
    }
    public static void strconcat(){
        String firstname = "Ajay";
        String lastname = "rathod";
        String fullname = firstname +" "+lastname;

        System.out.println(fullname);
    }
    public static void printletters(String str){

        for(char i = 0; i < str.length();i++){
            System.out.print(str.charAt(i));
        }
        System.out.println();
    }
    public static boolean palindromestring(String str){
        for(int i = 0; i < str.length()/2;i++){
            int n = str.length();
            if(str.charAt(i) == str.charAt(n-1-i)){
                return true;
            }
        }
        return false;
    }
    public static Float getshortest(String path){
        int x = 0, y = 0;
        for(int i = 0; i < path.length(); i++){
            char dir = path.charAt(i);
            if(dir == 'S'){
                y--;
            }
            else if(dir == 'N'){
                y++;
            }
            else if(dir == 'W'){
                x--;
            }
            else {
                x++;
            }
        }
        int x1 = x*x;
        int x2 = y*y;
        return (float)Math.sqrt(x1+x2);
    }
    public static void strequal(){
        String s1 = "Tony";
        String s2 = "Tony";
        String s3 = new String("Tony");

        if(s1 == s2){
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings not equal ");
        }
        if(s1.equals(s3)){
            System.out.println("Strings are  equal");
        } else {
            System.out.println("Stringd are not equal");
        }
    }
    public  static String tostr(String str, int si, int ei){
        String substr = "";
        for(int i = si; i < ei; i++) {
            substr += str.charAt(i);
        }
        return substr;
    }
    public static void comparestr(){
        String fruits[] = {"apple", " mango", "banana"};
        String largest = fruits[0];
        for(int i = 1; i < fruits.length; i++){
            if(largest.compareTo(fruits[i]) > 0){
                largest = fruits[i];
            }
        }
        System.out.println("largest string is : "+largest);
    }
    public static void strbuilde(){
        StringBuilder sb = new StringBuilder("");
        for(char ch =  'a'; ch <= 'z'; ch++){
            sb.append(ch);
            System.out.print(ch+" ");
        }
        System.out.println();
        System.out.println(sb.length());
    }
    public static String toupperstr(String str){
        StringBuilder sb = new StringBuilder("");
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        for(int i = 1; i < str.length(); i++){
            if(str.charAt(i) == ' ' && i < str.length()-1){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            } else {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
    public static  String strcompress(String str){
        String newstr = "";
         for(int i = 0; i < str.length(); i++){
             Integer  count = 0;
             while (i < str.length()-1 && str.charAt(i) == str.charAt(i+1)){
                 count++;
                 i++;
             }
             newstr += str.charAt(i);
             if(count > 0){
                 newstr += count.toString();
             }
         }
         return newstr;
    }
    public static void main(String[] args) {
        //strio("ajay");
       // strlen();
        //strconcat();
        //printletters();
      // palindromestring();
        //String str = "helloworld";
        //System.out.println(getshortest(str));
        //strequal();
       // System.out.println(tostr(str,0, 5));
        //inbuilt to string function
        //System.out.println(str.substring(0,5));
        //comparestr();
        //strbuilde();
        String str = "aaabbcccdd";
        System.out.println( strcompress(str));

    }
}
