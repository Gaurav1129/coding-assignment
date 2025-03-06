import java.util.Arrays;
import java.util.Scanner;

/**
 * This program checks if two input strings are anagrams of each other.
 * Anagrams are words/phrases formed by rearranging letters of another word/phrase.
 */
public class AnagramChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get user input
        System.out.print("Enter first string: ");
        String str1 = scanner.nextLine().trim();
        System.out.print("Enter second string: ");
        String str2 = scanner.nextLine().trim();
        
        // Check anagram status
        boolean result = areAnagrams(str1, str2);
        
        // Display result
        System.out.println("Output: " + result);
        
        scanner.close();
    }

    /**
     * Checks if two strings are anagrams using sorting method.
     * 
     * @param str1 First input string
     * @param str2 Second input string
     * @return true if strings are anagrams, false otherwise
     */
    public static boolean areAnagrams(String str1, String str2) {
        // Quick check for different lengths
        if (str1.length() != str2.length()) {
            return false;
        }
        
        // Convert to lowercase for case-insensitive comparison
        char[] chars1 = str1.toLowerCase().toCharArray();
        char[] chars2 = str2.toLowerCase().toCharArray();
        
        // Sort character arrays
        Arrays.sort(chars1);
        Arrays.sort(chars2);
        
        // Compare sorted arrays
        return Arrays.equals(chars1, chars2);
    }
}