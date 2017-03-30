import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        HashMap<Integer,Integer> hMap = new HashMap<Integer,Integer>();

        int sockPairs = 0;

        for (int i = 0; i < n; i++) {
            int colour = scan.nextInt();
            if (!hMap.containsKey(colour)) {
                hMap.put(colour, 1);
            }
            else {
                hMap.remove(colour);
                sockPairs += 1;
            }
        }

        scan.close();
        System.out.println(sockPairs);
    }
}
