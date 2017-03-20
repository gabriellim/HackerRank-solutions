import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        // Build ArrayList
        ArrayList<int[]> al = new ArrayList<int[]>();
        for (int i = 0; i < n; i++) {
            int arrLength = scan.nextInt();
            int[] arr = new int[arrLength];
            for (int j = 0; j < arrLength; j++) {
                arr[j] = scan.nextInt();
            }
            al.add(arr);
        }

        // Query ArrayList
        int n2 = scan.nextInt();
        for (int k = 0; k < n2; k++) {
            int arrNum = scan.nextInt();
            int index = scan.nextInt();

            try {
                int[] currentArr = al.get(arrNum - 1);
                System.out.println(currentArr[index - 1]);
            }
            catch (IndexOutOfBoundsException e) {
                System.out.println("ERROR!");
            }
        }
        scan.close();
    }
}
