package coreprogramming.methods.level3;
import java.util.Scanner;

public class CollinearPoints {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input for 3 points
        System.out.print("Enter x1, y1: ");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();

        System.out.print("Enter x2, y2: ");
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        System.out.print("Enter x3, y3: ");
        int x3 = sc.nextInt();
        int y3 = sc.nextInt();

        // Check using slope
        boolean slopeCheck = checkCollinearSlope(x1, y1, x2, y2, x3, y3);

        // Check using area
        boolean areaCheck = checkCollinearArea(x1, y1, x2, y2, x3, y3);

        System.out.println("Collinear Check using Slope: " + slopeCheck);
        System.out.println("Collinear Check using Area: " + areaCheck);
    }

    // Method to check collinearity using slope formula
    public static boolean checkCollinearSlope(int x1, int y1, int x2, int y2, int x3, int y3) {
        // Slope AB = (y2-y1)/(x2-x1)
        // Slope AC = (y3-y1)/(x3-x1)
        // Avoid division by zero
        int dx1 = x2 - x1;
        int dy1 = y2 - y1;
        int dx2 = x3 - x1;
        int dy2 = y3 - y1;

        return (dx1 * dy2 == dy1 * dx2); // cross multiplication to avoid floating point
    }

    // Method to check collinearity using area of triangle formula
    public static boolean checkCollinearArea(int x1, int y1, int x2, int y2, int x3, int y3) {
        double area = 0.5 * (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));
        return area == 0;
    }
}
