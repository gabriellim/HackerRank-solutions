import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.time.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int month = scan.nextInt();
        int day = scan.nextInt();
        int year = scan.nextInt();
        scan.close();

        LocalDate LD = LocalDate.of(year, month, day);
        System.out.println(LD.getDayOfWeek());
    }
}
