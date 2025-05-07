import java.util.*;

class Result {
    public static String isBalanced(String s) {
        Stack<Character> st = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            } else {
                if (!st.isEmpty()) {
                    char top = st.peek();
                    if ((top == '(' && ch == ')') ||
                        (top == '{' && ch == '}') ||
                        (top == '[' && ch == ']')) {
                        st.pop();
                    } else {
                        return "NO";
                    }
                } else {
                    return "NO";
                }
            }
        }
        return st.isEmpty() ? "YES" : "NO";
    }
}

public class BalancedBrackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // number of test cases
        scanner.nextLine(); // consume newline

        for (int i = 0; i < t; i++) {
            String s = scanner.nextLine();
            System.out.println(Result.isBalanced(s));
        }
    }
}
