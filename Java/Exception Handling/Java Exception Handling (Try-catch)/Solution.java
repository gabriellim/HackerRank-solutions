import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try {
            int x = Integer.parseInt(scan.nextLine());
            int y = Integer.parseInt(scan.nextLine());
            
            int result = x/y;
            System.out.println(result);
        }
        catch (NumberFormatException e) {
            System.out.println("java.util.InputMismatchException");
        }
        catch (ArithmeticException e) {
            System.out.println(e);
        }
    }
}