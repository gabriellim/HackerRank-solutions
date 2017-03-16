import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = 1;
        
        while(scan.hasNext()) {
            String result = String.format("%d %s", count, scan.nextLine());
            System.out.println(result);
            count += 1;
        }
        scan.close();
    }
}