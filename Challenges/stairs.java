package Expedia;

import java.util.ArrayList;

//Input 4
//O/p (1,1,1,1) (1,1,2) (1,2,1)(2,1,1)(2,2)
public class stairs {
    public static void main(String[] args) {
        int n = 4;
        System.out.println(findPattern(n));
        System.out.println("The answer is " + climbStairs(n));
    }

    static int findPattern(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }

        return findPattern(n - 1) + findPattern(n - 2) ;
    }

    static int climbStairs(int n) {
        if (n == 0)
            return 0;
        int prevsum = 0;
        int nextsum = 1;
        for (int i = 1; i <= n; i++) {
            int temp = prevsum + nextsum;
            prevsum = nextsum;
            nextsum = temp;
        }
        return nextsum;
    }
}
