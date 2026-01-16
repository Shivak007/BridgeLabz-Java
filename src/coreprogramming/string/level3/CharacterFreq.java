package coreprogramming.string.level3;
import java.util.*;

public class CharacterFreq {
    static Object[][] findFrequency(String str){
        int[] freq = new int[256];
        for(int i = 0; i < str.length(); i++){
            freq[str.charAt(i)]++;
        }

        int count = 0;
        for(int i = 0; i < 256; i++){
            if(freq[i] > 0){
                count++;
            }
        }

        int idx = 0;
        Object[][] result = new Object[count][2];
        for(int i = 0; i < 256; i++){
            if(freq[i] > 0) {
                result[idx][0] = (char) i;
                result[idx][1] = freq[i];
                idx++;
            }
        }
        return result;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        Object[][] frequencies = findFrequency(input);

        System.out.println("Character frequencies:");
        for (Object[] pair : frequencies) {
            System.out.println(pair[0] + " : " + pair[1]);
        }

        sc.close();
    }
}
