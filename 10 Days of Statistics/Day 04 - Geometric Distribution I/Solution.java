import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numerator = scan.nextInt();
        int denominator = scan.nextInt();
        int rounds = scan.nextInt();

        double defect = (double)numerator/denominator;
        double notDefect = 1 - defect;

        double probability = Math.pow(notDefect, rounds - 1) * defect;
        String result = String.format("%.3f", probability);
        System.out.println(result);
    }
}
