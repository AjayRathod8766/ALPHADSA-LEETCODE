import java.util.ArrayList;
import java.util.Collections;

public class PracticeArrList {
    public static void main(String[] args) {
        int n = 5;
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();

        System.out.println("Array 1 :"+arr1);
        System.out.println("Array 2 :"+arr2);

        for(int i = 1; i <= n; i++){
                arr1.add(i);
                arr2.add(i);
        }
        System.out.println("printed Array :"+arr1);
        System.out.println("printed Array "+arr2);
       // addelement();
        //iterretingloop();
        getElement();
    }
    public static void addelement(){
        ArrayList<String> arr = new ArrayList<>();
        arr.add("geeks");
        arr.add("geeks");
        System.out.println(arr);

        arr.add(1,"for");
        System.out.println(arr);

        arr.set(1,"For");
        System.out.println("updated list :"+arr);

        //removeing element
        arr.remove("geeks");
        System.out.println("After the object removal : "+arr);
    }
    public static void iterretingloop(){
        ArrayList<String> str = new ArrayList<>();
        str.add("geeks");
        str.add("geeks");
        str.add(1,"for");

        for(int i = 0; i < str.size(); i++){
            System.out.print(str.get(i)+" ");
        }
        System.out.println();
        //for each loop
        for(String str1 : str){
            System.out.print(str1+" ");
        }
        System.out.println();
    }
    public static void getElement(){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(6);
        list.add(8);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);
        Integer n = list.get(1);
        System.out.println("at Index 1 number is : "+n);

        //inserting misssing element
        list.add(2,3);
        System.out.println(list);

        //sorting an array
        Collections.sort(list);
        System.out.println("After Sorting Element : "+list);

        //size of an array
        System.out.println("size of an list : "+list.size());
    }
}
