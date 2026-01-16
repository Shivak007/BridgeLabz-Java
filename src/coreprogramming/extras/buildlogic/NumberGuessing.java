package coreprogramming.extras.buildlogic;
import java.util.*;

public class NumberGuessing {
    static int generateGuesses(int low, int high){
        Random random = new Random();
        return random.nextInt(low,high +1);
    }

    static String getFeedback(Scanner sc, int guess){
        System.out.print("Is the guessed number " + guess + " is low/high/correct? : ");
        return sc.nextLine().toLowerCase();
    }

    static int[] updateRange(int low, int high, int guess, String feedback){
        if(feedback.equals("low")){
            low = guess + 1;
        }else if(feedback.equals("high")){
            high = guess - 1;
        }
        return new int[] {low,high};
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Think of a number between 1 and 100.");
        System.out.println("I will try to guess it!");

        int low = 1, high = 100;
        boolean found = false;

        while(!found && low <= high){
            int guess = generateGuesses(low,high);
            String feedback = getFeedback(sc,guess);

            if (feedback.equals("correct")) {
                System.out.println("I guessed your number: " + guess);
                found = true;
            } else {
                int[] range = updateRange(low, high, guess, feedback);
                low = range[0];
                high = range[1];
            }
        }

        if (!found) {
            System.out.println("Invalid feedback!");
        }

        sc.close();
    }
}
