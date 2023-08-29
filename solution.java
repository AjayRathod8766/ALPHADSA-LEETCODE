import java.util.Scanner;

public class solution {
    public static double average(double x, double y, double z){
        return (x + y + z)/3;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y  = sc.nextDouble();
        double z = sc.nextDouble();
        System.out.print("the average is :"+average(x , y, z));

    }
}
