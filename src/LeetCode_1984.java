import java.util.Arrays;

public class LeetCode_1984 {

    public static int minimumDifference(int[] a, int k) {
       int diff=Integer.MAX_VALUE;
       int n=a.length;
       if(n==1){
           return 0;
       }
       Arrays.sort(a);
       for(int i=1;i<n && k>=0;i++){
         diff=Math.min(diff,a[i]-a[i-1]);
         k--;
       }
    return diff;
    }
    public static void main(String[] args) {
        int a[]={9,4,1,7};
        int k=2;
        int res=minimumDifference(a,k);
        System.out.println("Final result is " + res);

    }
}
