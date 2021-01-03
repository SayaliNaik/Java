package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//Input = XVII
//Output = 17
public class RomanToInteger {
    public static void main(String[] args) {
        HashMap<String,Integer> roman = new HashMap<>();
        String symbol = "XIV";
        roman.put("I",1);
        roman.put("IV",4);
        roman.put("V",5);
        roman.put("IX",9);
        roman.put("X",10);
        romanInt(roman,symbol);
    }





    static void romanInt(HashMap<String,Integer> roman,String symbol){

        String [] arr =  symbol.split("");
        System.out.println(Arrays.toString(arr));
        int adder = 0;
//        for(String c:arr){
//            if(roman.containsKey(c)){
//                adder = adder + roman.get(c);
//            }
//        }
  for(int i=0;i<arr.length-1;i++){
            if(roman.get(arr[i]) >= roman.get(arr[i+1])){
                adder = adder +roman.get(arr[i]);
            }
            else{
                adder = adder - roman.get(arr[i]);
            }
        }
        System.out.println(adder+roman.get(arr[arr.length-1]));
    }


}


//  for(int i=0;i<arr.length-1;i++){
//            if(roman.get(arr[i]) >= roman.get(arr[i+1])){
//                adder = adder +roman.get(arr[i]);
//            }
//            else{
//                adder = adder - roman.get(arr[i]);
//            }
//        }
//        System.out.println(adder);