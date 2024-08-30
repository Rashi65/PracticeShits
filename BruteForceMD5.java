import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class BruteForceMD5 {
    public static void main(String[] args) {
        String targetHash = "8b3d03a8c4acccbf1d1b485b0e8ddace05b0c2f3f1a57e41d07b033daf539628"; // MD5 hash of "hello"
        String result = bruteForceMD5(targetHash, 5); // Trying to brute force up to 5 characters
        if (result != null) {
            System.out.println("Original String: " + result);
        } else {
            System.out.println("Failed to find original string.");
        }
    }

    public static String bruteForceMD5(String targetHash, int maxLength) {
        char[] charset = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        char[] attempt = new char[maxLength];
        
        return recursiveAttempt(charset, attempt, targetHash, 0, maxLength);
    }

    private static String recursiveAttempt(char[] charset, char[] attempt, String targetHash, int position, int maxLength) {
        if (position == maxLength) {
            String currentAttempt = new String(attempt, 0, maxLength);
            if (getMD5Hash(currentAttempt).equals(targetHash)) {
                return currentAttempt;
            }
            return null;
        }
        
        for (char c : charset) {
            attempt[position] = c;
            String result = recursiveAttempt(charset, attempt, targetHash, position + 1, maxLength);
            if (result != null) {
                return result;
            }
        }
        return null;
    }

    public static String getMD5Hash(String input) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] messageDigest = md.digest(input.getBytes());
            StringBuilder hexString = new StringBuilder();
            for (byte b : messageDigest) {
                hexString.append(String.format("%02x", b));
            }
            return hexString.toString();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }
}
