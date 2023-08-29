import java.util.Scanner;

public class enenoddsum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number;
        int choice;

        int evensum = 0;
        int  oddsum  = 0;

        do{
            System.out.println("enter the number : ");
            number = sc.nextInt();

            if(number % 2 ==0){
                evensum += number;
            } else {
                oddsum += number;
            }
            System.out.println("Do you want to continue? press 1 for yes 0 for no ");
            choice = sc.nextInt();
        } while (choice == 1);

        System.out.println("sum of enennumbers: "+evensum);
        System.out.println("sum of odd numbers : "+oddsum);
    }
}
