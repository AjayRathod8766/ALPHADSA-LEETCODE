import java.util.Scanner;

public class breakstatement {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        do{
            int  n = sc.nextInt();
            if(n  % 10 == 0){
                break;
            }
            System.out.println(n);
        }while(true);
    }
}
