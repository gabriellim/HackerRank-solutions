import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        for (int i = 1; i <= n; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = n - i; j > 0; j--) {
                sb.append(" ");
            }
            for (int k = 0; k < i; k++) {
                sb.append("#");
            }

            System.out.println(sb);
        }
    }
}
