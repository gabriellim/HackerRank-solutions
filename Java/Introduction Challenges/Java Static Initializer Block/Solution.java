import java.io.*;
import java.util.*;

public class Solution {

    static boolean flag = false;
    static int B, H;

    static {
        Scanner scan = new Scanner(System.in);
        B = Integer.parseInt(scan.nextLine());
        H = Integer.parseInt(scan.nextLine());
        scan.close();
        
        if (B > 0 && H > 0) {
            flag = true;
        }
        else {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
    }

	public static void main(String[] args) { 
		if (flag) {
			int area = B * H;
			System.out.print(area);
		}	
	}
}