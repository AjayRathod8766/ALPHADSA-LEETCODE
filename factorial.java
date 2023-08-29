import java.math.*;
public class factorial {
    public static int  factorial(int n){
        int f = 1;
        for(int i = 1; i <= n; i++){
            f = f * i;
        }
        return f;
    }
    public static int bincoeff(int n, int r){
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial(n-r);

        int bincoeff = fact_n / (fact_r * fact_nmr);
        return bincoeff;
    }
    public static boolean isprime(int n){
        if (n == 2){
            return true;
        }
        for(int i = 2; i < n-1; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
    public static boolean ofprime(int n){
        if (n ==  0){
            return true;
        }
        for(int i = 2; i <= Math.sqrt(n); i++){
            if (n % i == 0){
                return false;
            }
        }
        return false;
    }
    public static void primesinrange(int n){
        for(int i = 0; i <= n; i++){
            if(isprime(i)){
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }
    public static void binToDec(int binNum){
        int mynum = binNum;
        int pow = 0;
        int decNum = 0;
        while (binNum > 0){
            int lastdigit = binNum % 10;
            decNum = decNum + (lastdigit *(int)Math.pow(2, pow));
            pow++;
            binNum = binNum /10;
        }
        System.out.println("decimal of "+mynum+" = "+decNum);
    }
    public static void DectoBin(int n){
        int mynum = n;
        int pow = 0;
        int binnum  = 0;

        while(n > 0){
            int rem = n % 2;
            binnum = binnum + (rem * (int)Math.pow(10, pow));
            pow++;
            n = n/2;
        }
        System.out.println("binary form of "+mynum+" = "+binnum);
    }


    public static void main(String[] args) {
        DectoBin(5);
    }
}
