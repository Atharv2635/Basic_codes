import java.security.SecureRandom;

public class PasswordGenerator {

    public static void main(String[] args) {
        int length = 12; // Length of the password
        System.out.println(generatePassword(length));
    }

    static String generatePassword(int length) {
        String uppercase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowercase = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";
        String specialCharacters = "!@#$%^&*()-_+=";

        String allCharacters = uppercase + lowercase + numbers + specialCharacters;

        SecureRandom random = new SecureRandom();

        StringBuilder password = new StringBuilder();

        for (int i = 0; i < length; i++) {

            int randomIndex = random.nextInt(allCharacters.length());
            password.append(allCharacters.charAt(randomIndex));
        }

        return password.toString();
    }
}