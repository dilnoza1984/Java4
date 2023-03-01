import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String word = "Hellojava";
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (!map.containsKey(c)) {
                map.put(c, 1);
            } else {
                map.put(c, map.get(c) + 1);
            }
        }
        System.out.println(map);
}
}
// Write a program that will count how many times each character is used in a String.