import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        int start = scan.nextInt();
        int end = scan.nextInt();
        scan.close();
        
        System.out.println(str.substring(start,end));
    }
}
