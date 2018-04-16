//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map<String, Integer> phoneBook=new HashMap<String, Integer>();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            
            //put the data in phoneBook
            
            phoneBook.put(name,phone);
            
        }
        while(in.hasNext()){
            String s = in.next();
            // Print the string with phone number
            if (phoneBook.containsKey(s))
            {
            System.out.println(s+"="+phoneBook.get(s));
            }
            else 
            {
             System.out.println("Not found"); 
            }
        }
        in.close();
    }
}