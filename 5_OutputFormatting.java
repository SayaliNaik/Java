import java.util.Scanner;
import java.text.DecimalFormat;

public class Solution {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String s1=sc.next();
                int x=sc.nextInt();
                //Complete this line
                
      DecimalFormat df = new DecimalFormat("000");
      String numberAsString = df.format(x);
               // System.out.println(s1+"               "+numberAsString);
                System.out.printf("%1$-14s %2$3s", s1, numberAsString);
                System.out.println();
            }
            System.out.println("================================");

    }
}