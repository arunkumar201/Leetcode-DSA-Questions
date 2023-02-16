import java.util.*;

public class Weekly332 {
    public static long findTheArrayConcVal(int[] a) {
        int n = a.length;
        if (n == 1) return a[0];
        int l = 0;
        int h = n - 1;
        int sum = 0;
        while (l<h) {
           String f=Integer.toString(a[l]);
           String last=Integer.toString(a[h]);
//            System.out.print(f+" ");
//            System.out.print(last+" ");
           String con=f+last;
           sum+=Integer.parseInt(con);
//            System.out.println(sum);

           l++;
           h--;
        }
//        System.out.println(a[n/2]);
        if(n%2!=0){
            sum+=a[n/2];
        }

   return sum;
    }

    public List<Integer> addToArrayForm(int[] num, int k) {
        ArrayList<Integer> ans=new ArrayList<>();
        int c=0;
        int n=num.length;
        int t=k;
        int j=n-1;
        while(t!=0){
            int last=t%10;
            t/=10;
            int sum=num[j]+last;
            if(sum<10){
                ans.add(sum+c);
                j--;
                System.out.println(sum + c);
            }else{
                c=sum%10;
                sum=sum/10;
                ans.add(sum+c);
            }
        }
        while(j>0) ans.add(num[j--]);
//        ans.rev/e();
        return ans;
    }

    public static long countFairPairs_b(int[] nums, int l, int u) {
      long count=0;
      int n=nums.length ;
        HashMap<Integer,Integer> mp=new HashMap<Integer,Integer>();
        mp.put(0,nums[0]);
        for (int i = 1; i <n; i++) {
            if(mp.size()>0 && nums[i]<=u){
                for (Map.Entry<Integer,Integer> entry : mp.entrySet()){
                    int k=entry.getKey();
                    int sum=nums[i]+mp.get(k);
                    if(k<i && (sum<=u && sum>=l)){
                          count++;
                    }
                }
                mp.put(i,nums[i]);
            }

        }
           return count;
    }

    public static int countFairPairs(int[] nums, int lower, int upper) {
        int n = nums.length;
        int count = 0;
        Arrays.sort(nums);
        int i = 0, j = 0;
        while (j < n) {

            if (nums[j] - nums[i] >= lower && nums[j] - nums[i] <= upper) {
                count += j - i;
                j++;
            } else if (nums[j] - nums[i] < lower) {
                j++;
            } else {
                i++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
//       int nums[]={5,14,13,8,12};
//        System.out.println(findTheArrayConcVal(nums));

        int []nums = {0,0,0,0,0,0};
        int lower =-1000000000, upper =-1000000000;
        System.out.println(countFairPairs(nums, lower, upper));
    }
}
