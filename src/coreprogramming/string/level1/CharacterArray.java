package coreprogramming.string.level1;
import java.util.*;

public class CharacterArray {
    static char[] toCharArray(String str1){
        char[] arr1 = new char[str1.length()];

        for(int i = 0; i < str1.length(); i++){
            arr1[i] = str1.charAt(i);
        }

        return arr1;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        str = str.replace(" ", "");
        char[] strArray = str.toCharArray();

        if(Arrays.equals(strArray, toCharArray(str))){
            System.out.println("Same results");
        }else{
            System.out.println("Different Output");
        }

        sc.close();
    }
}
