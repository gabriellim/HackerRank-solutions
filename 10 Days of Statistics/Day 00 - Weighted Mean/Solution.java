import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        
        int[] elements = arrBuilder(scan, n);
        int[] weights = arrBuilder(scan, n);
        
        int sum = 0, sumWeights = 0;
        for (int i = 0; i < n; i++) {
            sum += (elements[i] * weights[i]);
            sumWeights += weights[i];
        }
        double weightedMean = (double)sum/sumWeights;
        String result = String.format("%.1f", weightedMean);
        System.out.println(result);
    }
    
    static int[] arrBuilder(Scanner scan, int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        return arr;
    }
}