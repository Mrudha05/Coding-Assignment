import java.util.Scanner;

public class Pangram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        boolean isPangram = checkPangram(sentence);
        if (isPangram) {
            System.out.println("The entered sentence is a pangram.");
        } else {
            System.out.println("The entered sentence is not a pangram.");
        }
    }

    public static boolean checkPangram(String sentence) {
    // Convert to lowercase 
    String lowercaseSentence = sentence.toLowerCase();

    // Array to store the occurrence of each letter (a-z)
    boolean[] alphabet = new boolean[26];

    
    for (char c : lowercaseSentence.toCharArray()) {
        if (c >= 'a' && c <= 'z') {
            alphabet[c - 'a'] = true;
        }
    }

    // Check 
    for (boolean letterPresent : alphabet) {
        if (!letterPresent) {
            return false; // If any letter is missing, it's not a pangram
        }
    }

    return true; // All letters, is a pangram
}
}
