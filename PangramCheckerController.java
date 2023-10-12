import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PangramCheckerController {

    @GetMapping("/checkPangram")
    public boolean checkPangram(@RequestParam String input) {
        return isPangram(input);
    }

    private boolean isPangram(String input) {
        if (input == null) {
            return false;
        }

        // Create a boolean array to mark the presence of each alphabet
        boolean[] alphabetPresent = new boolean[26];
        input = input.toLowerCase(); // Convert input to lowercase for case-insensitive check

        // Iterate through the characters in the input
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if ('a' <= c && c <= 'z') {
                alphabetPresent[c - 'a'] = true;
            }
        }

        // Check if all alphabets (a to z) are present
        for (boolean present : alphabetPresent) {
            if (!present) {
                return false;
            }
        }

        return true;
    }
}
