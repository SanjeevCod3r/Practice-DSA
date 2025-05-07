import java.util.*;

public class RansomNoteOne{

    public static void checkMagazine(List<String> magazine, List<String> note) {
        Map<String, Integer> wordCount = new HashMap<>();

        for (String word : magazine) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        for (String word : note) {
            if (!wordCount.containsKey(word) || wordCount.get(word) == 0) {
                System.out.println("No");
                return;
            }
            wordCount.put(word, wordCount.get(word) - 1);
        }

        System.out.println("Yes");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int m = scanner.nextInt(); // number of words in magazine
        int n = scanner.nextInt(); // number of words in note
        scanner.nextLine(); // consume leftover newline

        List<String> magazine = Arrays.asList(scanner.nextLine().split(" "));
        List<String> note = Arrays.asList(scanner.nextLine().split(" "));

        checkMagazine(magazine, note);
    }
}
