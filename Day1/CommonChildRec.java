import java.util.*;

class Result {

    public static int solve(String s1, String s2, int i, int j) {
        if (i == s1.length()) return 0;
        if (j == s2.length()) return 0;

        int cnt = 0;
        if (s1.charAt(i) == s2.charAt(j)) {
            cnt = 1 + solve(s1, s2, i + 1, j + 1);
        } else {
            cnt = Math.max(solve(s1, s2, i + 1, j), solve(s1, s2, i, j + 1));
        }
        return cnt;
    }

    public static int commonChild(String s1, String s2) {
        return solve(s1, s2, 0, 0);
    }
}

public class CommonChildRec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        int result = Result.commonChild(s1, s2);
        System.out.println(result);
    }
}
