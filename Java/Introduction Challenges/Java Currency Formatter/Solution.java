import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double payment = scan.nextDouble();
        scan.close();

        String us = currencyFormatter("en", "US", payment);
        String india = currencyFormatter("en", "IN", payment);
        String china = currencyFormatter("zh", "CN", payment);
        String france = currencyFormatter("fr", "FR", payment);

        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }

    static String currencyFormatter(String language, String country, double payment) {
        Locale loc = new Locale(language, country);
        NumberFormat nf = NumberFormat.getCurrencyInstance(loc);
        return nf.format(payment);
    }
}
