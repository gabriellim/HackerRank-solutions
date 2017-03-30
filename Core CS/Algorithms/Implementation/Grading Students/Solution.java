import java.io.*;
import java.util.*;
import java.math.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            int grade = scan.nextInt();
            int rounded = round(grade,5);

            if (grade >= 38 && rounded - grade < 3) {
                System.out.println(rounded);
            }
            else {
                System.out.println(grade);
            }
        }
    }

    static int round(double grade, int multiple) {
        return (int)Math.ceil(grade/multiple) * multiple;
    }
}
