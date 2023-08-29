public class SumNatural {
    public static int natural(int n){
        //base
        if(n == 0){
            return 1;
        }
        return n*(n+1)/2;
    }
    public static int fact(int n) {
        if (n == 0) {
            return 1;
        }
        return n*fact(n-1);
    }
    public static int fib(int n){
        if(n == 0 || n == 1){
            return 1;
        }
        return fib(n - 1) + fib(n - 2);
    }
    public static boolean ispalindrome(String str, int start, int end){

        if(start >= end){
            return true;
        }
        return (str.charAt(start) == str.charAt(end)) && ispalindrome(str,start+1, end-1);
    }
    public static  int sumofdigit(int n){
        if(n < 10){
            return n;
        }
        return sumofdigit(n/10) + n%10;
    }

    public static void main(String[] args) {
      //String str = "abbca";
      //System.out.println(ispalindrome(str,0,str.length()-1));
        int n = 123;
        System.out.println(sumofdigit(n));
    }
}
