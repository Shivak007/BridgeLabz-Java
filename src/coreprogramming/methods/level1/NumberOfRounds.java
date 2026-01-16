package coreprogramming.methods.level1;
import java.util.Scanner;

public class NumberOfRounds {
    public static double perimeter(double side1, double side2, double side3){
        return (side1 + side2 + side3);
    }

    public static int computeRounds(double perimeter){
        double distance = 5000.0;
        return (int) Math.round(distance/perimeter);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter three sides of triangle: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double p = perimeter(a,b,c);
        System.out.printf("The  athlete needs to run %d rounds around the triangular path",computeRounds(p));
        sc.close();
    }
}
