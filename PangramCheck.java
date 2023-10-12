import java.util.HashSet;
import java.util.Set;

public class PangramCheck {
    public static boolean isPangram(String sentence) {
        Set<Character> uniqueLetters = new HashSet<>();
        String lowercaseSentence = sentence.toLowerCase();

        for (char c : lowercaseSentence.toCharArray()) {
            if (Character.isLetter(c)) {
                uniqueLetters.add(c);
            }
        }

        return uniqueLetters.size() == 26;
    }
}
