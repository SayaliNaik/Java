package Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class Rotate {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        rotateArr(arr);
    }
    static void rotateArr(int [] arr){
        int [] temp  = new int[arr.length];

        for(int i=0;i<arr.length-3;i++){
            temp[i] = arr[i+3];
        }
        for(int i=2;i<arr.length;i++){
            temp[i] = arr[i-2];
        }
        System.out.println(Arrays.toString(temp));

    }
}
