import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int factorial(int n) {
        if (n==0){
            return 1;
        }
        else{
            return (n * factorial(n-1));
        }
    }

    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    System.out.println(factorial(n));
    
    }
}