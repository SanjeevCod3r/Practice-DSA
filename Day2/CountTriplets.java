import java.util.*;

public class CountTriplets {

    static long countTriplets(List<Long> arr, long r) {
        HashMap<Long, Long> s = new HashMap<>();
        HashMap<Long, Long> t = new HashMap<>();

        long cnt = 0;
        for (long i : arr) {
            if (t.containsKey(i)) {
                cnt += t.get(i);
            }

            if (s.containsKey(i)) {
                long next = i * r;
                t.put(next, t.getOrDefault(next, 0L) + s.get(i));
            }

            long next = i * r;
            s.put(next, s.getOrDefault(next, 0L) + 1);
        }

        return cnt;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        long r = scanner.nextLong();

        List<Long> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(scanner.nextLong());
        }

        long result = countTriplets(arr, r);
        System.out.println(result);
    }
}
