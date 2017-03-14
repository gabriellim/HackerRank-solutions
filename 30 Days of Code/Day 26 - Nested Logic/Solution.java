import java.util.*;
import java.math.*;

class BookReturnDate {
    public int day, month, year;
    
    BookReturnDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
}

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BookReturnDate actual = new BookReturnDate(scan.nextInt(), scan.nextInt(), scan.nextInt());
        BookReturnDate expected = new BookReturnDate(scan.nextInt(), scan.nextInt(), scan.nextInt());
        scan.close();
        
        int fine;
        if (actual.year > expected.year) {
            fine = 10000;
        }
        else if (actual.year == expected.year && actual.month > expected.month) {
            fine = 500*Math.abs(actual.month - expected.month);
        }
        else if (actual.month == expected.month && actual.day > expected.day) {
            fine = 15*Math.abs(actual.day - expected.day);
        }
        else {
            fine = 0;
        }
    
        System.out.println(fine);
    }
}