import java.util.*;
class Solution {

    static final HashMap<Character,Character> hmap = new HashMap<Character,Character>();
    static {
        hmap.put('[', ']');
        hmap.put('{', '}');
        hmap.put('(', ')');
    }

    public static void main(String []args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            String str = scan.nextLine();
            System.out.println(bracketMatch(str));
        }
    }

    static boolean bracketMatch(String str) {
        Stack<Character> myStack = new Stack<Character>();

        for (char left : str.toCharArray()) {
            if (!Character.isLetterOrDigit(left)) {
                if (hmap.containsKey(left)) {
                    myStack.push(left);
                }
                else {
                    if (!myStack.empty()) {
                        char right = hmap.get(myStack.peek());

                        if (left == right) {
                            myStack.pop();
                        }
                    }
                    else {
                        return false;
                    }
                }
            }
        }

        return myStack.empty()
    }
}
