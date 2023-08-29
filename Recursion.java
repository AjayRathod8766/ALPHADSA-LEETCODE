public class Recursion {
    public  static int fib(int n){
        if(n == 0){
            return 0;
        }
        if(n == 1 || n == 2){
            return 1;
        } else {
            return (fib(n-1) +fib(n - 2));
        }
    }
    public static int fact(int n){
        if(n == 0 || n == 1){
            return 1;
        }  else {
            return n * fact(n - 1);
        }

    }

    public static void main(String[] args) {
        //System.out.println(fib(4));
        System.out.println(fact(6));
    }
}
