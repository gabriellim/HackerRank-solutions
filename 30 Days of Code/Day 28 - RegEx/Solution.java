import java.util.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        ArrayList<String> al = new ArrayList<String>();

        for (int i = 0; i < n; i++) {
            String firstName = scan.next();
            String emailID = scan.next();

            Pattern p = Pattern.compile("@gmail.com");
            Matcher m = p.matcher(emailID);

            if (m.find()) {
                al.add(firstName);
            }
        }
        scan.close();

        Collections.sort(al);

        for (String fname : al) {
            System.out.println(fname);
        }
    }
}
