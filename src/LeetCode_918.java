public class LeetCode_918 {

    public static int maxSubarraySumCircular(int[] a) {
            int n=a.length;
            if(n==1){
                return a[0];
            }
            int minSum=Integer.MAX_VALUE;
            int maxSum=Integer.MIN_VALUE;
            int curr_Max=0;
            int curr_Min=0;
            int totalSum=0;
            for(int i: a){
                curr_Max+=i;
                maxSum=Math.max(maxSum,curr_Max);
                curr_Min+=i;
                minSum=Math.min(minSum,curr_Min);
                totalSum+=i;
            }
            return Math.max(maxSum,totalSum-minSum);
    }

    public static void main(String[] args) {
        int a[]={-3,-2,-3};
        int res=maxSubarraySumCircular(a);
        System.out.println("Final result: " + res);
    }
}
