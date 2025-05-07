import java.util.*;

class Result {
    public static int makingAnagrams(String s1, String s2) {
        int[] freq1 = new int[26];
        int[] freq2 = new int[26];

        for (char c : s1.toCharArray()) {
            freq1[c - 'a']++;
        }

        for (char c : s2.toCharArray()) {
            freq2[c - 'a']++;
        }

        int deletions = 0;
        for (int i = 0; i < 26; i++) {
            deletions += Math.abs(freq1[i] - freq2[i]);
        }

        return deletions;
    }
}

public class MakeAnagrams {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s1 = scanner.nextLine();
        String s2 = scanner.nextLine();

        int result = Result.makingAnagrams(s1, s2);

        System.out.println(result);
        scanner.close();
    }
}
