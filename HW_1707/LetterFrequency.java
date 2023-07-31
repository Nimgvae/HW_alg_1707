package HW_1707;
import java.util.HashMap;
import java.util.Map;

public class LetterFrequency {
    public static void main(String[] args) {
        String text = "This is a sample text to build a letter frequency dictionary.";
        Map<Character, Integer> letterFrequency = buildLetterFrequency(text);
        System.out.println(letterFrequency);
    }

    public static Map<Character, Integer> buildLetterFrequency(String text) {
        Map<Character, Integer> frequency = new HashMap<>();
        String letters = text.toLowerCase().replaceAll("[^a-zа-я]", "");

        for (char letter : letters.toCharArray()) {
            frequency.put(letter, frequency.getOrDefault(letter, 0) + 1);
        }

        return frequency;
    }
}
