package coreprogramming.methods.level1;
import java.util.*;

public class IsSpringSeason {
    public static String isSpring(int day, int month){
        if(month == 3 && day >=20 || month == 4 || month == 5 || month == 6 && day <= 20){
            return "Its's Spring Season";
        }else{
            return "It's not Spring Season";
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the date: ");
        int day = sc.nextInt();

        System.out.print("Enter the month: ");
        int month = sc.nextInt();

        System.out.println(isSpring(day,month));
        sc.close();
    }
}
