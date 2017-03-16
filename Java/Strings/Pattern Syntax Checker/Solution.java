import java.util.Scanner;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        
        while(n-- > 0) {
            String pattern = scan.nextLine();
            try {
                Pattern p = Pattern.compile(pattern);
                System.out.println("Valid");
            }
            catch (PatternSyntaxException e) {
                System.out.println("Invalid");
            }
        }
        scan.close();
    }
}
