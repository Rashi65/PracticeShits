package StringsPackage;

import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;

public class RotatableWord {

    public static boolean isRotatable(String word) {
        // Mapping of characters that can be rotated into each other
        Map<Character, Character> rotatableMap = new HashMap<>();
        rotatableMap.put('a', 'e');
        rotatableMap.put('e', 'a');
        rotatableMap.put('b', 'q');
        rotatableMap.put('q', 'b');
        rotatableMap.put('d', 'p');
        rotatableMap.put('p', 'd');
        rotatableMap.put('f', 'f');
        rotatableMap.put('h', 'y');
        rotatableMap.put('y', 'h');
        rotatableMap.put('i', 'i');
        rotatableMap.put('l', 'l');
        rotatableMap.put('m', 'w');
        rotatableMap.put('w', 'm');
        rotatableMap.put('n', 'u');
        rotatableMap.put('u', 'n');
        rotatableMap.put('o', 'o');
        rotatableMap.put('s', 's');
        rotatableMap.put('x', 'x');
        rotatableMap.put('z', 'z');

        int len = word.length();
        for (int i = 0; i < len; i++) {
            char startChar = word.charAt(i);
            char endChar = word.charAt(len - 1 - i);
            if (!rotatableMap.containsKey(startChar) || rotatableMap.get(startChar) != endChar) {
                return false;
            }
        }
        return true;
    }

    public static List<String> getRotatableWords(List<String> words) {
        List<String> rotatableWords = new ArrayList<>();
        for (String word : words) {
            if (isRotatable(word)) {
                rotatableWords.add(word);
            }
        }
        return rotatableWords;
    }

    public static void main(String[] args) {
        // List of words to test
        List<String> words = List.of("aoo", "boq", "mwm", "hiy", "xox");

        // Get and print all rotatable words
        List<String> rotatableWords = getRotatableWords(words);
        System.out.println("Rotatable words: " + rotatableWords);
    }
}

