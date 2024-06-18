import java.util.Scanner;

public class ex11 {
    
    // Function to encrypt plaintext using Caesar Cipher
    public static String encryptCaesarCipher(String plaintext, int shift) {
        StringBuilder ciphertext = new StringBuilder();
        for (char c : plaintext.toCharArray()) {
            if (Character.isLetter(c)) {
                char shifted = (Character.isLowerCase(c)) ? (char) ('a' + (c - 'a' + shift) % 26) : (char) ('A' + (c - 'A' + shift) % 26);
                ciphertext.append(shifted);
            } else {
                ciphertext.append(c); // non-alphabetic characters remain unchanged
            }
        }
        return ciphertext.toString();
    }

    // Function to decrypt Caesar Cipher ciphertext
    public static String decryptCaesarCipher(String ciphertext, int shift) {
        return encryptCaesarCipher(ciphertext, 26 - shift); // decryption is simply encryption with opposite shift
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter plaintext: ");
        String plaintext = scanner.nextLine();

        System.out.print("Enter shift (positive integer): ");
        int shift = scanner.nextInt();

        // Encryption
        String ciphertext = encryptCaesarCipher(plaintext, shift);
        System.out.println("Encrypted text: " + ciphertext);

        // Decryption
        String decryptedText = decryptCaesarCipher(ciphertext, shift);
        System.out.println("Decrypted text: " + decryptedText);
        
        scanner.close();
    }
}
