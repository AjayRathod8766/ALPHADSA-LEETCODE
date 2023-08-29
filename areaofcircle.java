import java.util.Scanner;

public class areaofcircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Float rad = sc.nextFloat();
        Float area = 3.14f * rad * rad;
        System.out.println(area);
    }
}
