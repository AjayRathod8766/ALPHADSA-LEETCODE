import java.util.Arrays;
public class Classes_IN_JAVA {
    //methods in java arrays class
    public static void aslistarr() {
        int arr[] = {10, 20, 15, 22, 35};

        System.out.println("Integer Array as List:"+Arrays.asList(arr));

    }
    public static void binerysearchC(){
        int arr[] = {10,20,15,22,35};
        Arrays.sort(arr);
        int key = 22;

        //print the corrosponding arry
        System.out.println(key + " index found at "+Arrays.binarySearch(arr,key));
    }

    public static void main(String[] args) {
        //aslistarr();
        binerysearchC();
    }

 }
