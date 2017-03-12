import java.util.*;
import java.io.*;

class Solution {
    
    public static void main(String []argh) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        HashMap<String,Integer> hmap = new HashMap<String,Integer>(); 
        
        for(int i = 0; i < n; i++) {
            String name = scan.next();
            int phone = scan.nextInt();
            hmap.put(name, phone);
        }
        
        while(scan.hasNext()) {
            String s = scan.next();
            
            if (hmap.containsKey(s)) {
                String result = String.format("%s=%s", s, hmap.get(s));
                System.out.println(result);
            }
            else {
                System.out.println("Not found");
            }
        }
        scan.close();
    }
}
