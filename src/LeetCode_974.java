import java.util.Arrays;
import java.util.HashMap;

public class LeetCode_974
{
    public static int subarraysDivByK(int[] a, int k) {
          int curr_sum=0;
          int count=0;
          int preSum[]=new int[a.length];
          int x = 0;
          int Running_Sum=0;
          for(int j: a){
              Running_Sum+=j;
              preSum[x++]=Running_Sum;
          }
        System.out.println(Arrays.toString(preSum));
        HashMap<Integer,Integer> mp=new HashMap<Integer,Integer>();

        for(int i=0;i<a.length;i++){
            curr_sum+=a[i];
            int rem=curr_sum%k;
            if(rem==0){
                count++;
            }
            if(rem<0){
                     rem+=k;
            }
            if(mp.containsKey(rem)){
                count+=mp.get(rem);
            }
            mp.put(rem,mp.getOrDefault(rem,0)+1);
        }
       return count;
    }
    public static int subarraysDivByK_BruteForce(int[] nums, int k) {
        int count=0;
        int sum=0;
        for(int i=0; i<nums.length; i++){
            sum=0;
            for(int j=i; j<nums.length; j++){
                sum+=nums[j];
                if(sum%k==0) count++;
            }
        }
        return count;
    }
  public static void main(String[] args) {
       int  nums[] = {4,5,0,-2,-3,1};
       int k = 5;
       int res=subarraysDivByK(nums,k);
        System.out.println("Final result is " + res);
    }


}
