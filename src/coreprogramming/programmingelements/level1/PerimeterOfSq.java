package coreprogramming.programmingelements.level1;
import java.util.*;

public class PerimeterOfSq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of the side: ");
        int side = sc.nextInt();
        int perimeter = 4 * side;

        System.out.printf("The length of the side is %dcm whose perimeter is %dcm", side, perimeter);
        sc.close();
    }
}
