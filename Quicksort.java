

public class Quicksort {
    public static int partation(int arr[], int low ,int high){
        int pivot = arr[high];
        int i = (low - 1);
        for(int j = low; j <= high - 1; j++){
           if(arr[j] < pivot){
               i++;
               swap(arr,i,j);
           }
        }
        swap(arr,i+1,high);
        return (i + 1);
    }
    public static void Quick(int arr[], int low, int high){
        if(low < high){
            int pi = partation(arr,low,high);
            Quick(arr,low,pi-1);
            Quick(arr,pi+1,high);
        }
    }
    public static void swap(int arr[], int i, int j ){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void printarr(int arr[]){
        for(int i = 0 ; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
       int arr[] = {50, 10 ,90 , 80 ,70};
       int n = arr.length;
       Quick(arr,0,n-1);
       System.out.println("Sorted Array");
       printarr(arr);
    }
}
