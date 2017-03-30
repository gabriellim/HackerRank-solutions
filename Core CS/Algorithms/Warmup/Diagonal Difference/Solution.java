import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        int sumPrimaryDiag = 0, sumSecondaryDiag = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n;j++) {
                int num = scan.nextInt();

                if (i == j) {
                    sumPrimaryDiag += num;
                }
                else if (i + j == n - 1) {
                    sumSecondaryDiag += num;
                }

                if (n % 2 != 0) {
                    if (i == (n - 1)/2 && j == (n - 1)/2) {
                        sumSecondaryDiag += num;
                    }
                }
            }
        }
        scan.close();

        System.out.println(Math.abs(sumPrimaryDiag - sumSecondaryDiag));
    }
}
