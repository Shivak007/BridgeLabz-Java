package coreprogramming.arrays.level2;
import java.util.Scanner;

public class FriendComparison{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[] ages = new int[3];
        double[] heights = new double[3];
        String[] names = {"Amar","Akbar","Anthony"};

        for (int i =0; i < 3; i++){
            System.out.print("Enter the age of " + names[i] + ": ");
            ages[i] = sc.nextInt();

            System.out.print("Enter the height of " + names[i] + ": ");
            heights[i] = sc.nextInt();
        }

        int youngestIndex = 0;
        for (int i = 1; i < 3; i++) {
            if (ages[i] < ages[youngestIndex]) {
                youngestIndex = i;
            }
        }

        int tallestIndex = 0;
        for (int i = 1; i < 3; i++) {
            if (heights[i] > heights[tallestIndex]) {
                tallestIndex = i;
            }
        }

        System.out.println();
        System.out.println("Youngest Friend: " + names[youngestIndex] + " (Age: " + ages[youngestIndex] + ")");
        System.out.println("Tallest Friend: " + names[tallestIndex] + " (Height: " + heights[tallestIndex] + " cm)");

        sc.close();
    }
}