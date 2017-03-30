import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int max = Integer.MIN_VALUE;
        int maxCount = 0;

        for (int i = 0; i < n; i++) {
            int current = scan.nextInt();

            if (current > max) {
                max = current;
                maxCount = 1;
            }
            else if (current == max) {
                maxCount += 1;
            }
        }

        scan.close();
        System.out.println(maxCount);
    }
}
