import java.util.*;
import java.io.*;

class Solution {
    public static void main(String [] args) {

        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        for(int i = 0; i < n; i++)
        {
            // Order by size (byte < short < int < long)
            try
            {
                long x = scan.nextLong();;
                System.out.println(x + " can be fitted in:");
                
                // Byte: 8 bits
                if (x >= -128 && x <= 127) {
                    System.out.println("* byte");
                }
                // Short: 16 bits
                if (x >= -1*Math.pow(2,16)/2 && x <= Math.pow(2,16)/2 - 1) {
                    System.out.println("* short");
                }
                // Int: 32 bits
                if (x >= -1*Math.pow(2,32)/2 && x <= Math.pow(2,32)/2 - 1) {
                    System.out.println("* int");
                }
                // Long: 64 bits
                if (x >= -1*Math.pow(2,64)/2 && x <= Math.pow(2,64)/2 - 1) {
                    System.out.println("* long");
                }
            }
            catch(Exception e)
            {
                System.out.println(scan.next() + " can't be fitted anywhere.");
            }

        }
        scan.close();
    }
}
