public class largestelement {
    public static int largest(int arr[]){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for(int i = 0; i < arr.length; i++){
            if(largest < arr[i]){
                largest = arr[i];
            }
            if(smallest > arr[i]){
                smallest = arr[i];
            }
        }
        System.out.println("smallest element is :"+smallest);
        System.out.println("largesh element is :"+largest);
        return largest;
    }

    public static void main(String[] args) {
        int arr[] = {2, 5, 7, 9, 8, 4};
        largest(arr);
        //System.out.println("largesh element is :"+largest(arr));
    }
}
