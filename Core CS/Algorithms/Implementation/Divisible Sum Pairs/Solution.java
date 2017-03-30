import java.io.*;
import java.util.*;
import java.math.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int divisor = scan.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        scan.close();

        int countPairs = 0;

        for (int j = 0; j < n; j++) {
            for (int k = j + 1; k < n; k++) {
                if ((arr[j] + arr[k]) % divisor == 0) {
                    countPairs += 1;
                }
            }
        }
        System.out.println(countPairs);
    }
}
