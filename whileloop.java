import java.util.Scanner;

public class whileloop {
    public static void main(String[] args) {
//
//        int counter  =0;
//        while(counter < 1){
//            System.out.println("hello world ");
//            counter++;
//        }
//        System.out.println("printed hello world 10 times");
       // printnums();
        printsum();
    }
    public static void  printnums() {
        Scanner sc = new Scanner(System.in);
        int range = sc.nextInt();
        int counter = 1;
        while(counter <=    range){
        System.out.println(counter +" ");
         counter++;
        }
        System.out.println();
    }
    public static void printsum(){
        Scanner sc = new Scanner(System.in);
        int n  = 5;
        int sum = 0;
        int  i = 1;
        while (i <= n){
            sum += i;
            i++;
        }
        System.out.println(sum);
    }
}
