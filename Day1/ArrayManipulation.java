import java.util.*;

class Result {
    public static long arrayManipulation(int n, List<List<Integer>> queries) {
        long[] arr = new long[n + 2];

        for (List<Integer> query : queries) {
            int a = query.get(0);
            int b = query.get(1);
            int k = query.get(2);

            arr[a] += k;
            arr[b + 1] -= k;
        }

        long max = 0;
        long current = 0;
        for (int i = 1; i <= n; i++) {
            current += arr[i];
            if (current > max) {
                max = current;
            }
        }

        return max;
    }
}

public class ArrayManipulation{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        List<List<Integer>> queries = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            List<Integer> query = new ArrayList<>();
            query.add(scanner.nextInt());
            query.add(scanner.nextInt());
            query.add(scanner.nextInt());
            queries.add(query);
        }

        long result = Result.arrayManipulation(n, queries);
        System.out.println(result);
    }
}
