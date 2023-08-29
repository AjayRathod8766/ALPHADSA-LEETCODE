public class squrepattern {
    public static void main(String[] args) {
        int line = 0;
        while (line < 4){
            System.out.println("****");
            line++;
        }
       // revercenum();
        printrev();
    }
    public static void revercenum(){
        int n = 10899;

        while (n > 0){
            int lastdigit  = n % 10;
            System.out.print(lastdigit+" ");
            n /= 10;
        }
        System.out.println();
    }
    public static void printrev(){
        int n = 10899;
        int rev = 0;
        while(n > 0){
            int lastdigit = n % 10;
            rev = (rev * 10) + lastdigit;
            n = n/10;
        }
        System.out.println(rev +" ");
    }
}
