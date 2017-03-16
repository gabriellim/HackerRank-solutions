import java.util.*;
import java.util.Scanner;

class MyCalculator {
    public int power(int n, int p) throws Exception{
        if (n >= 0 && p >= 0) {
            return (int)Math.pow(n,p);
        }
        else {
            throw new Exception("n and p should be non-negative");
        }
    }
}

class Solution {

	public static void main(String[] args) {
	  	Scanner scan = new Scanner(System.in);

	  	while (scan.hasNextInt()) {
	   		int n = scan.nextInt();
	   		int p = scan.nextInt();
	   		MyCalculator my_calculator = new MyCalculator();
	   		scan.close();

		   	try {
		    	System.out.println(my_calculator.power(n, p));
		  	}
		  	catch (Exception e) {
		    	System.out.println(e);
		   	}
	  	}
 	}
}
