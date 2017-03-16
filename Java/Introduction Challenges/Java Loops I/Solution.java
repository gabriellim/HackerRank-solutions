import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        scan.close();
        
        for (int i = 1; i <= 10; i++) {
            String result = String.format("%d x %d = %d", n, i, n*i);
            System.out.println(result);
        }
    }
}