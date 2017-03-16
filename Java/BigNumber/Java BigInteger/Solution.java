import java.io.*;
import java.util.*;
import java.math.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BigInteger bi = new BigInteger(scan.nextLine());
        BigInteger bi2 = new BigInteger(scan.nextLine());
        scan.close();
        
        BigInteger sum = bi.add(bi2);
        BigInteger product = bi.multiply(bi2);
        
        System.out.println(sum);
        System.out.println(product);
    }
}