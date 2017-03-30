import java.io.*;
import java.util.*;

public class Solution {

    static int solveMeFirst(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int sum = solveMeFirst(a,b);
        System.out.println(sum);
    }
}
