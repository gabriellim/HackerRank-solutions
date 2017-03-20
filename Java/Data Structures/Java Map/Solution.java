import java.util.*;
import java.io.*;

class Solution {

    public static void main(String []args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        HashMap<String,Integer> hmap = new HashMap<String,Integer>();

        for (int i = 0; i < n; i++)
        {
            String name= scan.nextLine();
            if (!hmap.containsKey(name)) {
                int phone = Integer.parseInt(scan.nextLine());
                hmap.put(name, phone);
            }
        }

        while(scan.hasNext())
        {
            String str = scan.nextLine();
            if (hmap.containsKey(str)) {
                int phone = hmap.get(str);
                String result = String.format("%s=%d", str, phone);
                System.out.println(result);
            }
            else {
                System.out.println("Not found");
            }
        }
    }
}
