public class searchAlgorithms {
    public static int linearsearch(int arr[], int key){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == key ){
                return i;
            }
        }
        return -1;
    }
    public static int binerysearch(int arr[], int key){
        int start = 0, end = arr.length - 1;

        while(start <= end){
            int mid = (start + end )/2;
            if(arr[mid] == key){
                return mid;
            }
            if(arr[mid] == key){
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 9, 8, 6, 4, 1};
        int key = 8;
        //System.out.println(linearsearch(arr,key));
       System.out.println(binerysearch(arr,key));
    }
}
