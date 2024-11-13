import java.util.Scanner;

public class SpoonerismGenerator {


    private static String getWord(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        return scanner.nextLine();
    }


    private static int vowelIndex(String word) {
        for (int i = 0; i < word.length(); i++) {
            char ch = Character.toLowerCase(word.charAt(i));
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return i;
            }
        }
        return -1; // Return -1 if no vowel is found
    }

    // Method to run the main logic of the program
    private static void run() {
        String firstWord = getWord("Enter the first word: ");
        String secondWord = getWord("Enter the second word: ");

        int firstVowelIndexFirst = vowelIndex(firstWord);
        int firstVowelIndexSecond = vowelIndex(secondWord);

        // Check if both words have valid consonants before the first vowel
        if (firstVowelIndexFirst <= 0 || firstVowelIndexSecond <= 0) {
            System.out.println("One or both words do not have valid consonants before the first vowel or start with a vowel.");
            return;
        }

        // Extract the parts of the words
        String firstConsonantPart = firstWord.substring(0, firstVowelIndexFirst);
        String firstVowelPart = firstWord.substring(firstVowelIndexFirst);
        
        String secondConsonantPart = secondWord.substring(0, firstVowelIndexSecond);
        String secondVowelPart = secondWord.substring(firstVowelIndexSecond);

        // Create the spoonerized words
        String spoonerizedFirst = secondConsonantPart + firstVowelPart;
        String spoonerizedSecond = firstConsonantPart + secondVowelPart;

        // Print the original and spoonerized words
        System.out.println("Original words: " + firstWord + " and " + secondWord);
        System.out.println("Spoonerized words: " + spoonerizedFirst + " and " + spoonerizedSecond);
    }

    public static void main(String[] args) {
        run();
    }
}