public class typepromotion {
    /*java automatically promotes each byte, short , or char operant to int
    * when evaluting an expression*/
    public static void main(String[] args) {
        char a = 'a';
        char b = 'b';

        System.out.println((int)(b));
        System.out.println((int)(a));
        System.out.println(a);
        System.out.println(b-a);
    }
}
