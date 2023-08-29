public class binerysearch {
    public static int binery(int arr[], int key){
        int right = 0;
        int left = arr.length-1;
        while(right <= left){
            int mid = right + (left - right)/2;
            if(arr[mid] == key){
                return mid;
            }
            if(arr[mid] <  key){
                right = mid +1;
            } else {
                left = mid - 1;
            }
        }
        return -1;
    }
    public static int linearsearch(int arr[],int key){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == key){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {2, 4, 6, 8, 10 , 12, 14};
        System.out.println(binery(arr,10));
        System.out.println(linearsearch(arr,12));
    }
}
