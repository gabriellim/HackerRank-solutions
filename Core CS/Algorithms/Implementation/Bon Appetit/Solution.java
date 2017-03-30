import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();

        int sum = 0;
        for (int i = 0; i < n; i++) {
            int cost = scan.nextInt();

            if (i != k) {
                sum += cost;
            }
        }

        int actualPrice = (int)sum/2;
        int chargedPrice = scan.nextInt();
        scan.close();

        if (actualPrice != chargedPrice) {
            System.out.println(chargedPrice - actualPrice);
        }
        else {
            System.out.println("Bon Appetit");
        }
    }
}
