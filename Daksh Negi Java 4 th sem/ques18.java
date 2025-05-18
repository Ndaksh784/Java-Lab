import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ques18 {

    public static boolean isPalindrome(String word) {
        int left = 0, right = word.length() - 1;
        while (left < right) {
            if (word.charAt(left) != word.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        int palindromeCount = 0;

        try (BufferedReader br = new BufferedReader(new FileReader("myfile.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] words = line.split("\\W+"); // split by non-word chars
                for (String word : words) {
                    if (!word.isEmpty() && isPalindrome(word.toLowerCase())) {
                        palindromeCount++;
                    }
                }
            }
            System.out.println("Number of palindromes in file: " + palindromeCount);
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }
}
