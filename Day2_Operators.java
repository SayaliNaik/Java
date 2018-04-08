import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double meal_cost = in.nextDouble();
        int tip_percent = in.nextInt();
        int tax_percent = in.nextInt();
        
        double tip=(meal_cost*tip_percent/100);
		//System.out.print(tip); 
		

        double tax=(meal_cost*tax_percent/100);
        //System.out.print(tax);  
		
        double totalCost=meal_cost+tip+tax;
        //System.out.print(totalCost); 
        int finalPrice=(int) Math.round(totalCost);
   System.out.print("The total meal cost is "+finalPrice+" dollars.");     
        
        in.close();
    }
}