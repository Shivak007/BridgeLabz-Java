package coreprogramming.string.level1;
import java.util.*;

public class Substring {
    static String isSubstring(String str1, int start, int end){
        String res = "";
        for(int i = start; i < end; i++){
            res = res  + str1.charAt(i);
        }
        return res;
    }

    public static void checkResults(String str1, String str2) {
        if (str1.equals(str2)) {
            System.out.println("Both methods give the same result.");
        } else {
            System.out.println("Results differ between manual and built-in method.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String str = sc.next().trim();

        System.out.print("Enter the start index: ");
        int start = sc.nextInt();

        System.out.print("Enter the end index: ");
        int end = sc.nextInt();

        String uStr = str.substring(start,end);
        String bStr = isSubstring(str,start,end);

        System.out.println("Built-in function:  " + uStr);
        System.out.println("User-Defined Function: " + bStr);

        checkResults(uStr,bStr);
        sc.close();
    }
}
