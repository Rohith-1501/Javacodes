public class LargestSumContiguousSubArray {
    public static void main(String[] args) {
        int[] a = {-2,-3,4,-1,-2,1,5,-3};
        int n = a.length-1;
        System.out.println("Maximum contiguous sum is " + maxSubArraySum(a,n));
    }
    private static int maxSubArraySum(int[] a, int n) {

        int max_current = Integer.MIN_VALUE;
        int max_final = 0;

        for (int i = 0; i < n; i++) {
            max_final = max_final + a[i];
            if (max_current < max_final)
                max_current = max_final;
            if (max_final < 0)
                max_final = 0;
        }
        return max_final;
    }
}
