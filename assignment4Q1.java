public class assignment4Q1 {
    public static void main(String[] args) {
        for(int i = 0; i < 5; i++){
            System.out.println("hello");
            i += 2;
        }
        whatswrong();
    }
    public static void whatswrong(){
        for(int i = 0; i <= 5; i++){
            System.out.println("i = "+i);
        }
       // System.out.println("i after the loop = "+i);
    }
}
