import java.io.*;
import java.util.*;
import java.math.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BigInteger n = scan.nextBigInteger();
        scan.close();
    
        String result = "not prime";
        if (n.isProbablePrime(10)) { // P(prime) = 1 - 1/2^certainty where 1 - 1/2^10 is approx. 99.9%
            result = "prime";
        }
        
        System.out.println(result);
   }
}
