package coreprogramming.methods.level1;
import java.util.*;

public class TrigonometricFunctions {
    public static double[] calculateTrigonometricFunctions(double angle) {
        double radians = Math.toRadians(angle);

        double sine = Math.sin(radians);
        double cosine = Math.cos(radians);
        double tangent = Math.tan(radians);

        return new double[]{sine,cosine,tangent};
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter angle (in degrees): ");
        double angle = sc.nextDouble();


        double[] trigResults = calculateTrigonometricFunctions(angle);
        System.out.printf("Sine (%.1f) = %.3f \n",angle, trigResults[0]);
        System.out.printf("Cosine (%.1f) = %.3f \n",angle, trigResults[1]);
        System.out.printf("Tangent (%.1f) = %.3f \n",angle, trigResults[2]);

        sc.close();
    }
}
