import java.io.*;
import java.util.*;

public class Solution {
    static boolean isAnagram(String a, String b) {
        
        if (a.length() != b.length()) {
            return false;
        }

        a = a.toLowerCase();
        b = b.toLowerCase();
        
        HashMap<Character,Integer> hmap = new HashMap<Character,Integer>();
        for (int i = 0; i < a.length(); i++) {
            char key = a.charAt(i);
            if (hmap.containsKey(key)) {
                int val = hmap.get(key);
                hmap.put(key, val+1);
            }
            else {
                hmap.put(key, 1);
            }
        }
        
        // System.out.println("BEFORE REMOVAL: " + Arrays.asList(hmap)); 
                
        for (int j = 0; j < b.length(); j++) {
            char key = b.charAt(j);
            if (hmap.containsKey(key)) {
                int val = hmap.get(key);
                if (val == 1) {
                    hmap.remove(key);
                }
                else {
                    hmap.put(key, val-1);
                }
            }
        }
                           
        // System.out.println("AFTER REMOVAL: " + Arrays.asList(hmap)); 
        
        if (hmap.isEmpty()) {
            return true;
        }
        return false;
    }
    

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}