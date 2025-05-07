import java.util.*;

public class JavaHashset {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // number of pairs

        Set<String> uniquePairs = new HashSet<>();

        for (int i = 0; i < t; i++) {
            String left = scanner.next();
            String right = scanner.next();

            // Sort the pair to make it unordered (treat (a, b) and (b, a) the same)
            String[] pair = {left, right};
            Arrays.sort(pair);
            String key = pair[0] + "," + pair[1];

            uniquePairs.add(key);
            System.out.println(uniquePairs.size());
        }
    }
}
