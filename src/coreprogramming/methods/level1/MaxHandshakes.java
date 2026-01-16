package coreprogramming.methods.level1;
import java.util.Scanner;

public class MaxHandshakes {
    public static long getMaxHandshakes(int n) {
        return (n * (n - 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number of students: ");
        int numberOfStudents = sc.nextInt();
        System.out.println("Maximum number of handshakes: " + getMaxHandshakes(numberOfStudents));
        sc.close();
    }
}

