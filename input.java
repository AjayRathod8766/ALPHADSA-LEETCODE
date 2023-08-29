import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number :");
        int a = sc.nextInt();
        System.out.println("enter the second number: ");
        int b  = sc.nextInt();

        //int sum = a + b;
        int product = a * b;
        System.out.println(" is :"+product);
    }
}
