import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        long sum = 0;

        for (int i = 0; i < n; i++) {
            long num = scan.nextInt();
            sum += num;
        }

        System.out.println(sum);
        scan.close();
    }
}
