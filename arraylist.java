import java.util.ArrayList;

public class arraylist {
    public static void main(String[] args) {
        int n = 5;

        ArrayList<Integer> arr1 = new ArrayList<Integer>(n);
        ArrayList<Integer> arr2 = new ArrayList<Integer>();

        System.out.println("array 1 :"+arr1);
        System.out.println("Array 2 :"+arr2);

        for(int i = 0; i < n ; i++){
            arr1.add(i);
            arr2.add(i);
        }
        System.out.println("array 1 : "+arr1);
        System.out.println("array 2 :"+arr2);
    }
}
