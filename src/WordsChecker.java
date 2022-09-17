import java.util.HashSet;
import java.util.Set;

public class WordsChecker {
    private String text;

    public WordsChecker(String text) {
        this.text = text;
    }

    public boolean hasWord(String word) {
        Set<String> wordSet = new HashSet<>();
        String[] words = text.toLowerCase().split("\\P{IsAlphabetic}+");
        for (String part : words) {
            wordSet.add(part);
        }
        return wordSet.contains(word.toLowerCase());
    }
}