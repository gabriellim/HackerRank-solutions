import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a0 = scan.nextInt();
        int a1 = scan.nextInt();
        int a2 = scan.nextInt();
        int b0 = scan.nextInt();
        int b1 = scan.nextInt();
        int b2 = scan.nextInt();
        scan.close();

        int scoreA = 0, scoreB = 0;

        int[] A = new int[]{a0,a1,a2};
        int[] B = new int[]{b0,b1,b2};

        for (int i = 0; i < A.length; i++) {
            if (A[i] > B[i]) {
                scoreA += 1;
            }
            else if (B[i] > A[i]) {
                scoreB += 1;
            }
        }

        System.out.format("%d %d", scoreA, scoreB);
    }
}
