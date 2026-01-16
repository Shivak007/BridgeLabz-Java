package coreprogramming.arrays.level1;
import java.util.*;

public class VoteEligibility{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] students = new int[10];

        System.out.println("Enter the age of 10 Students:");
        for(int i = 0; i < students.length; i++){
            students[i] = sc.nextInt();
        }

        for(int i = 0; i < students.length; i++){
            int age = students[i];

            if(age < 0){
                System.out.println("Invalid Age");
            }else if(age >= 18){
                System.out.println("The student with the " + age + " can vote");
            }else{
                System.out.println("The student with the " + age + " cannot vote");
            }
        }
    }
}