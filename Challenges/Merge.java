package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class Merge {
    public static void main(String[] args) {
        int [] a = {1,3,5,7};
        int [] b ={2,4,6,8};
        mergeList(a,b);
    }

    static void mergeList(int [] a,int [] b){
        LinkedList<Integer> both = new LinkedList<>();
        for(int i=0;i<a.length;i++){
            both.add(a[i]);
        }
        for(int i=0;i<b.length;i++){
            both.add(b[i]);
        }

       Collections.sort(both);
        System.out.println(both);

        for(int i=0;i<a.length;i++){
            a[i] = both.pop();
        }
        for(int i=0;i<b.length;i++){
            b[i] =  both.pop();
        }

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
    }
}
