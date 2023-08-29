import java.util.Scanner;

public class assignment3Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your day :");
        int day = sc.nextInt();

        switch (day){
            case 1: System.out.println("monday");
                break;
            case 2: System.out.println("Tuesday");
                break;
            case 3: System.out.println("wednsday");
                break;
            case 4: System.out.println("thrusday");
                break;
            case 5: System.out.println("friday");
                break;
            case 6: System.out.println("saturda");
                break;
            case 7: System.out.println("Sunday");
                break;
            default: System.out.println("day not found");
        }
    }
}
