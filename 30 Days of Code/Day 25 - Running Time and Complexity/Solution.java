import java.util.*;
import java.math.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        
        while (n-- > 0) {
            int num = Integer.parseInt(scan.nextLine());
            System.out.println(checkPrime(num));
        }
    }
    
    public static String checkPrime(int num) {
        if (num <= 1) {
            return "Not prime";   
        }
        
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return "Not prime";
            }
        }
        return "Prime";
    }
}