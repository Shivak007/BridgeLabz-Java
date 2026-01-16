package coreprogramming.methods.level3;
import java.util.Arrays;

public class OTPGenerator {
    public static void main(String[] args) {
        int numOTPs = 10;
        int[] otps = new int[numOTPs];

        // Generate 10 OTPs
        for (int i = 0; i < numOTPs; i++) {
            otps[i] = generateOTP();
        }

        System.out.println("Generated OTPs: " + Arrays.toString(otps));
        System.out.println("All OTPs unique? " + areUnique(otps));
    }

    // Method to generate a 6-digit OTP
    public static int generateOTP() {
        return 100000 + (int)(Math.random() * 900000); // 100000 to 999999
    }

    // Method to check uniqueness of OTPs
    public static boolean areUnique(int[] otps) {
        for (int i = 0; i < otps.length; i++) {
            for (int j = i + 1; j < otps.length; j++) {
                if (otps[i] == otps[j]) return false;
            }
        }
        return true;
    }
}
