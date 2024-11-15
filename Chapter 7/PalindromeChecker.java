import java.util.Scanner;

public class PalindromeChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt user for input
        System.out.println("Enter a string: ");
        String input = scanner.nextLine();
        
        // Check if the input string is a palindrome
        if (isPalindrome(input)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
        
        scanner.close();
    }

    public static boolean isPalindrome(String str) {
        // Remove spaces and punctuation, and convert to lower case
        String cleanedStr = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        
        // Use StringBuilder to reverse the cleaned string
        StringBuilder reversedStr = new StringBuilder(cleanedStr);
        reversedStr.reverse();
        
        // Compare the cleaned string with its reverse
        return cleanedStr.equals(reversedStr.toString());
    }
}