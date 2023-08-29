public class ArraysJava {
    public static int largestarr(int arr[]){
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
        return largest;
    }
    public static void reverse(int arr[]){
        int start = 0 , end = arr.length-1;
        while(start < end){
            int temp = arr[start];
            arr[start]  = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void printpairs(int arr[]){
        for(int i = 0; i < arr.length; i++){
            int curr = arr[i];
            for(int j = i+1; j < arr.length; j++) {
                System.out.print("(" + curr + "," + arr[j] + ")");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void printsubarr(int arr[]){
        for (int i = 0; i <= arr.length; i++){
            for(int j = i; j <= arr.length; j++){
                for(int k = i; k < j; k++){
                    System.out.print(arr[k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
    public static void maxsumarr(int arr[]){
        int curr = 0;
        int maxsum = Integer.MIN_VALUE;

        for(int i = 0; i <= arr.length; i++){
            for(int j = i; j <= arr.length; j++) {
                curr = 0;
                for (int k = i; k < j; k++) {
                    curr += arr[k];
                }
                if(maxsum < curr){
                    maxsum = curr;
                }
            }
        }
        System.out.println("maxsum is "+maxsum);
    }
    public static void kadanesalgorithm(int arr[]){
        int maxsum = Integer.MIN_VALUE;
        int currsum = 0;
        for(int i = 0; i < arr.length;i++){
            currsum += arr[i];
        }
        if (currsum < 0){
            currsum = 0;
        }
        maxsum = Math.max(currsum,maxsum);
        System.out.println("max sum is "+maxsum);
    }
    public static void printarr(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void acessarr(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.println("Element present at "+i+":"+arr[i]);
        }
        System.out.println();
    }
    public static int countdigits(int x){
        int res = 0;
        while (x > 0){
            x = x / 10;
            res++;
        }
        return res;
    }
    public static int palindrome(int num){
       //base condition
        if( num < 10){
            System.out.print(num);
            //return;
        } else {
            System.out.print(num % 10);

            return   palindrome(num / 10);
        }
        return 0;
    }
    public static int fact(int n){
        if(n == 0|| n == 1){
            return 1;
        }
        int temp = n * fact(n - 1);
        return temp;
    }

    public static void main(String[] args) {
       // int arr[] = {3, 8, 4, 2, 9, 10};
        //System.out.println(largestarr(arr));
        //reverse(arr);
        //printpairs(arr);
       //printarr(arr);
       // printsubarr(arr);
       // maxsumarr(arr);
       // kadanesalgorithm(arr);
        //acessarr(arr);
       // System.out.println(countdigits(1234));
      int n = 5;
      System.out.print(fact(n));


    }
}
