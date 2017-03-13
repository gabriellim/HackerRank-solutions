import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


class Difference {
  	private int[] elements;
  	public int maximumDifference;

    Difference(int[] arr) {
        this.elements = arr;
    }

    public void computeDifference() {
        if (this.elements.length == 1) {
            this.maximumDifference = this.elements[0];
        }
        
        int min = this.elements[0], max = this.elements[0];
        this.maximumDifference = Math.abs(max - min);
        
        for (int i = 1; i < this.elements.length; i++) {
            int current = this.elements[i];
            if (current < min) {
                min = current;
            }
            if (current > max) {
                max = current;
            }
            int diff = Math.abs(max - min);
            if (diff >  this.maximumDifference) {
                this.maximumDifference = diff;
            }
        }
    }
} // End of Difference class

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}