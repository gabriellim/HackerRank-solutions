import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int pos = 0, neg = 0, zero = 0;


        for (int i = 0; i < n; i++) {
            int num = scan.nextInt();
            if (num  > 0) {
                pos += 1;
            }
            else if (num < 0) {
                neg += 1;
            }
            else {
                zero += 1;
            }
        }
        scan.close();

        double posFrac = (double)pos/n;
        double negFrac = (double)neg/n;
        double zeroFrac = (double)zero/n;

        System.out.println(String.format("%.6f", posFrac));
        System.out.println(String.format("%.6f", negFrac));
        System.out.println(String.format("%.6f", zeroFrac));
    }
}
