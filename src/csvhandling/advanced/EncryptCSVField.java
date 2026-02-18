package csvhandling.advanced;
import javax.crypto.*;
import javax.crypto.spec.SecretKeySpec;
import java.util.Base64;

public class EncryptCSVField {
    static String key = "1234567890123456";

    public static String encrypt(String data) throws Exception {
        Cipher cipher = Cipher.getInstance("AES");
        SecretKeySpec sk = new SecretKeySpec(key.getBytes(), "AES");
        cipher.init(Cipher.ENCRYPT_MODE, sk);
        return Base64.getEncoder().encodeToString(cipher.doFinal(data.getBytes()));
    }

    public static String decrypt(String data) throws Exception {
        Cipher cipher = Cipher.getInstance("AES");
        SecretKeySpec sk = new SecretKeySpec(key.getBytes(), "AES");
        cipher.init(Cipher.DECRYPT_MODE, sk);
        return new String(cipher.doFinal(Base64.getDecoder().decode(data)));
    }

    public static void main(String[] args) throws Exception {
        String enc = encrypt("50000");
        System.out.println("Encrypted: "+enc);
        System.out.println("Decrypted: "+decrypt(enc));
    }
}

