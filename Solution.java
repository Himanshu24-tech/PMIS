// find the largest distict largest number
import java.io.*;
import java.util.*;
import java.util.stream.*;

class Result {
    public static int secondLargest(int n, List<Integer> arr) {
        int largest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > largest) {
                second = largest;
                largest = num;
            } else if (num < largest && num > second) {
                second = num;
            }
        }

        return second == Integer.MIN_VALUE ? -1 : second;
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(
            new InputStreamReader(System.in)
        );

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Arrays.stream(
            bufferedReader.readLine().trim().split("\\s+")
        )
        .map(Integer::parseInt)
        .collect(Collectors.toList());

        int result = Result.secondLargest(n, arr);

        if (result == -1) {
            System.out.println("Not Possible");
        } else {
            System.out.println(result);
        }

        bufferedReader.close();
    }
}