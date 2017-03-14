import java.util.*;
import java.math.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int actualDay = scan.nextInt(), actualMonth = scan.nextInt(), actualYear = scan.nextInt();
        int expectedDay = scan.nextInt(), expectedMonth = scan.nextInt(), expectedYear = scan.nextInt();
        scan.close();
        
        int fine;
        if (actualYear > expectedYear) {
            fine = 10000;
        }
        else if (actualYear == expectedYear && actualMonth > expectedMonth) {
            fine = 500*Math.abs(actualMonth - expectedMonth);
        }
        else if (actualMonth == expectedMonth && actualDay > expectedDay) {
            fine = 15*Math.abs(actualDay - expectedDay);
        }
        else {
            fine = 0;
        }
    
        System.out.println(fine);
    }
}