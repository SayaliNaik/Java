package Leetcode;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

//print all permutations of a given string S with single space and all permutations should be in lexicographically increasing order.
//
//Constraints:
//1 ≤ T ≤ 10
//1 ≤ size of string ≤ 5
public class StringPermutation {
    public static void main(String[] args) {
        String a = "SAN";
        strPerm(a);
    }

    //ANS,ASN,NAS,NSA,SAN,SNA
    static void strPerm(String a) {
        char arr[] = a.toCharArray();
        System.out.println(arr);
        Arrays.sort(arr);
        System.out.println(arr);

//        char temp[] = new char[arr.length];
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);

            System.out.print(a.substring(0, i));
            System.out.println(a.substring(i+1));

        }
//        System.out.println(temp);
    }
}
