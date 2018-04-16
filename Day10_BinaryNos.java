import java.io.*;
import java.util.*;

/*public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i= scan.nextInt();
     

    }
}*/

public class Solution 
{
    private static int maxConsecutiveOnes(int i)
    {
        // Initialize result
        int count = 0;
 
        // Count the number of iterations to
        // reach x = 0.
        while (i!=0)
        {
            // This operation reduces length
            // of every sequence of 1s by one.
            i = (i & (i << 1));
 
            count++;
        }
 
        return count;
    }
 
    // Driver code
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        int i= scan.nextInt();
        System.out.println(maxConsecutiveOnes(i));
        
    }
}