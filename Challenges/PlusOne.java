package Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        int[] a = {1,2,3};
        //124
        int sum =0;
        for(int i=0;i<a.length;i++){
            sum = sum + a[i]*  (int) Math.pow(10, a.length-1-i);
        }

        System.out.println(sum+1);

        String b = "abcba1233211";
        isPali(b);
        findPali(b);
        int[] run = {1,1,1,1,1};
        runningSum(run);

    }

    static void findPali(String b){
        ArrayList<String> temp = new ArrayList<>();
        int max =0;
        String longest = null;
        for(int i=0;i<b.length();i++){
            for(int j=i+2;j<b.length();j++){
                if(isPali(b.substring(i,j))){
                    temp.add(b.substring(i,j));
                    int length = b.substring(i,j).length();
                    if(length>max){
                        max = length;
                        longest = b.substring(i,j);
                    }
                }
            }
        }
        System.out.println("Longest sub is "+ longest);

    }

    static boolean isPali(String b){
        for(int i=0;i<b.length()/2;i++){
            if (b.charAt(i) != b.charAt(b.length() - 1 - i)) {
               return false;
            }
        }
        return true;
    }

    static void runningSum(int [] run){

        for(int i=0;i<run.length;i++){
            int sum =0;
            for(int j=0;j<=i;j++){
                sum = sum + run[i];
            }
            System.out.println(sum);
        }

    }
}
