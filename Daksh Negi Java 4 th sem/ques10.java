import java.util.*;

class WordExample {
    private String strdata; 
    public WordExample(String str) {
        this.strdata = str.trim(); 
    }
    private boolean isVowel(String str, int index) {
        if (index < 0 || index >= str.length()) return false;
        char ch = str.charAt(index);
        return (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U');
    }
    public void countWord() {
        String[] words = strdata.substring(0, strdata.length() - 1).split("\\s+"); 
        int count = 0;

        for (String word : words) {
            if (isVowel(word, 0) && isVowel(word, word.length() - 1)) {
                count++;
            }
        }

        System.out.println("Number of words starting and ending with a vowel: " + count);
    }

   
    public void placeWord() {
        String[] words = strdata.substring(0, strdata.length() - 1).split("\\s+");
        List<String> vowelWords = new ArrayList<>();
        List<String> otherWords = new ArrayList<>();

        for (String word : words) {
            if (isVowel(word, 0) && isVowel(word, word.length() - 1)) {
                vowelWords.add(word);
            } else {
                otherWords.add(word);
            }
        }

        vowelWords.addAll(otherWords); 
        System.out.println("Rearranged Sentence: " + String.join(" ", vowelWords));
    }
}


public class ques10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Name: Daksh Negi");
        System.out.println("Section - B1");
        System.out.println("Roll No. - 22");
        System.out.println("University Roll No. - 2318686");
        System.out.print("\nEnter a sentence ending with '.', '!', or '?': ");
        String sentence = sc.nextLine();
        WordExample obj = new WordExample(sentence);
        obj.countWord();
        obj.placeWord();

        sc.close();
    }
}
