import java.util.*;

public class TwoStrings{

    public static String twoStrings(String s1, String s2) {
        Set<Character> charsS1 = new HashSet<>();

        for (char c : s1.toCharArray()) {
            charsS1.add(c);
        }

        for (char c : s2.toCharArray()) {
            if (charsS1.contains(c)) {
                return "YES";
            }
        }

        return "NO";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int q = scanner.nextInt();
        scanner.nextLine(); // consume leftover newline

        for (int i = 0; i < q; i++) {
            String s1 = scanner.nextLine();
            String s2 = scanner.nextLine();

            System.out.println(twoStrings(s1, s2));
        }
    }
}
