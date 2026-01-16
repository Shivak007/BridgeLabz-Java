package coreprogramming.programmingelements.level1;
import java.util.*;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of the base (in inch): ");
        float base = sc.nextFloat();
        System.out.print("Enter the height of Triangle (in inch): ");
        float height = sc.nextFloat();

        double areaInInch = 0.5F * base * height;
        double areaInCm = areaInInch * 6.4516;

        System.out.printf("The area of triangle in inch is %.2finch^2 and in cms %.2fcm^2", areaInInch, areaInCm);
        sc.close();
    }
}
