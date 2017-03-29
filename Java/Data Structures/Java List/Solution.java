import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> AL = arrayListBuilder(scan);
        int Q = scan.nextInt();

        for (int i = 0; i < Q; i++) {
            String query = scan.next();
            if (query.equals("Insert")) {
                int insIndex = scan.nextInt();
                int element = scan.nextInt();
                AL.add(insIndex, element);
            }
            else if (query.equals("Delete")) {
                int delIndex = scan.nextInt();
                AL.remove(delIndex);
            }
        }

        for (int j = 0; j < AL.size(); j++) {
            System.out.print(AL.get(j) + " ");
        }

        scan.close();
    }

    static ArrayList<Integer> arrayListBuilder(Scanner scan) {
        int n = scan.nextInt();
        ArrayList<Integer> al = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            al.add(scan.nextInt());
        }
        return al;
    }
}
