import java.util.*;

class Result {
    public static int hourglassSum(List<List<Integer>> arr) {
        int maxSum = Integer.MIN_VALUE;
    
        for (int k = 0; k < 16; k++) { 
            int i = k / 4; // row index
            int j = k % 4; // column index
    
            int sum = arr.get(i).get(j)+ arr.get(i).get(j + 1)+ arr.get(i).get(j + 2)
            + arr.get(i + 1).get(j + 1) + arr.get(i + 2).get(j) + 
            arr.get(i + 2).get(j + 1) + arr.get(i + 2).get(j + 2);
    
            maxSum = Math.max(maxSum, sum);
        }
    
        return maxSum;
    }   
}

public class HourGlassSumOneLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<List<Integer>> arr = new ArrayList<>();

        for (int i = 0; i < 6; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j < 6; j++) {
                row.add(scanner.nextInt());
            }
            arr.add(row);
        }

        int result = Result.hourglassSum(arr);
        System.out.println(result);
    }
}
