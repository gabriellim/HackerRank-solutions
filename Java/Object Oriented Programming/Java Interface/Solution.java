import java.util.*;

interface AdvancedArithmetic {
    int divisor_sum(int n);
}

class MyCalculator implements AdvancedArithmetic {
    public int divisor_sum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum;
    }
}

class Solution {
    public static void main(String[] args) {
        MyCalculator my_calculator = new MyCalculator();
        System.out.println("I implemented: ");
        ImplementedInterfaceNames(my_calculator);
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        System.out.println(my_calculator.divisor_sum(n) + "\n");
        scan.close();
    }

    /*
    *  ImplementedInterfaceNames method takes an object and prints the name of the interfaces it implemented
    */
    static void ImplementedInterfaceNames(Object o) {
        Class[] theInterfaces = o.getClass().getInterfaces();

        for (int i = 0; i < theInterfaces.length; i++) {
            String interfaceName = theInterfaces[i].getName();
            System.out.println(interfaceName);
        }
    }
}
