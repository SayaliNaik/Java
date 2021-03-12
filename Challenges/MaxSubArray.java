package Arrays;

public class MaxSubArray {
    public static void main(String[] args) {
        int [] a ={-1,-2,-3,-2};
        maxSum(a);
    }

    static void maxSum(int [] a){
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for(int i=0;i<a.length;i++){
            sum = sum +a[i];
            max = Math.max(max,sum);
            if(sum< 0){
                sum =0;
            }
        }
        System.out.println(max);
    }
}
