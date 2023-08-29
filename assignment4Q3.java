import java.util.Scanner;

public class assignment4Q3 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num;
        int fact  = 1;

        System.out.println("Enter any positive integer:");
        num = sc.nextInt();

        for (int i = 1; i <= num; i++){
            fact *= i;
        }
        System.out.println("factorial : "+ fact);
        printmultioftable(5);
    }
    public static void printmultioftable(int number){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i <= 10; i++){
            System.out.println(n+" * "+ i +" = "+n*i);
        }
    }

}
