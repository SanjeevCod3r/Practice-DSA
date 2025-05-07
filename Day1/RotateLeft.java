import java.util.*;

public class RotateLeft {
    
    public static List<Integer> rotateLeft(int d, List<Integer> arr) {
        int n = arr.size();
        List<Integer> rotated = new ArrayList<>();

        // Add from d to end
        for (int i = d; i < n; i++) {
            rotated.add(arr.get(i));
        }

        // Add from start to d
        for (int i = 0; i < d; i++) {
            rotated.add(arr.get(i));
        }

        return rotated;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int d = scanner.nextInt();

        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(scanner.nextInt());
        }

        List<Integer> result = rotateLeft(d, arr);

        for (int num : result) {
            System.out.print(num + " ");
        }

        scanner.close();
    }
}
