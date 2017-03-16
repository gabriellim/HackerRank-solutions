import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        scan.close();
        
        String result = "";
        if (n % 2 != 0) {
            result = "Weird";
        }
        else {
            if ((n >= 2 && n <= 5) || (n > 20)) {
                result = "Not Weird";
            }
            else {
                result = "Weird";
            }
        }
        System.out.println(result);
    }
}
