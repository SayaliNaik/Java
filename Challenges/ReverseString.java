package Leetcode;

public class ReverseString {
    public static void main(String[] args) {
        char[] s = {'A', 'n', 'k', 'i', 't'};
        revStr(s);
    }

    static void revStr(char[] s) {
        char[] temp = new char[s.length];
        int i=0;
        while(i<s.length){
            for (int j = s.length - 1; j >= 0; j--) {
                temp[j] = s[i];
                i=i+1;
            }
        }
        System.out.println(temp);

}
}
