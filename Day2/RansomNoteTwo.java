import java.util.*;

public class RansomNoteTwo {

    public static void checkMagazine(List<String> magazine, List<String> note) {
        for (String word : note) {
            if (!magazine.contains(word)) {
                System.out.println("No");
                return;
            } else {
                magazine.remove(word);
            }
        }
        System.out.println("Yes");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int m = scanner.nextInt();
        int n = scanner.nextInt();
        scanner.nextLine(); // consume leftover newline

        List<String> magazine = new ArrayList<>(Arrays.asList(scanner.nextLine().split(" ")));
        List<String> note = Arrays.asList(scanner.nextLine().split(" "));

        checkMagazine(magazine, note);
    }
}
