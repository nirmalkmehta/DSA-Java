import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
/*
Problem
You are given two arrays
 and
, of length
. You can select any subarray and then sort the elements in ascending order of that subarray for arrays
 and
.

Find the minimum length of the subarray you can choose to make
 and
 same after performing the operation.
 and
 are permutations of each other.

Input Format:

The first line contains an integer
 denoting the number of test cases.
The first line of each test case contains an integer
.
The next line of each test case contains
 space-separated integers, elements of array
.
The next line of each test case contains
 space-separated integers, elements of array
.
Output Format:

For each test case, print the minimum length of the subarray you can choose to make
 and
 same after performing the operation.
 */

class MinimumLength {
    public static void main(String args[]) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int[] arrayA = new int[n];
            int[] arrayB = new int[n];
            for (int j = 0; j < n; j++) {
                arrayA[j] = scanner.nextInt();
            }
            for (int j = 0; j < n; j++) {
                arrayB[j] = scanner.nextInt();
            }
            System.out.println(findMinSubarrayLength(n, arrayA, arrayB));
        }
        scanner.close();   // Writing output to STDOUT
    }

    private static int findMinSubarrayLength(int n, int[] arrayA, int[] arrayB) {
        int start = -1, end = -1;
        for (int i = 0; i < n; i++) {
            if (arrayA[i] != arrayB[i]) {
                if (start == -1) {
                    start = i;
                }
                end = i;
            }
        }
        return (start == -1) ? 0 : (end - start + 1);
    }
}
