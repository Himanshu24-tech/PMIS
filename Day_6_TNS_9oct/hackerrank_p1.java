// Problem Statement
// A number is called a Special Number if the sum of the factorials of its digits is equal to the original number.
// For example, the number 145 is a Special Number because:
// - \(1! = 1\)
// - \(4! = 24\)
// - \(5! = 120\)
// Sum = 1 + 24 + 120 = 145
// Your task is to determine whether a given positive integer is a Special Number.
// Input Format
// A single positive integer \(N\).
// Constraints
// \(1 \leq N \leq 1,000,000\)
// Output Format
// // Print Special Number if the given number satisfies the condition. Otherwise, print Not a Special Number.

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;


class Result {

    
    public static int isSpecialNumber(int n) {
    int original = n;
    int sum = 0;

    while (n > 0) {
        int digit = n % 10;
        int fact = 1;

        for (int i = 1; i <= digit; i++) {
            fact *= i;
        }

        sum += fact;
        n /= 10;
    }

    return (sum == original) ? 1 : 0;
}

    }


public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        int result = Result.isSpecialNumber(n);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
