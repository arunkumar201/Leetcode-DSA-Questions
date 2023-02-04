import java.util.HashMap;

public class LeetCode_2542 {
    public static long maxScore(int[] nums1, int[] nums2, int k) {
        HashMap<Integer,Integer> mp=new HashMap<Integer,Integer>();
        for(int j:nums2) mp.put(j,mp.getOrDefault(j,0)+1);
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums1.length;i++){

            for(int j=i+1;j<nums1.length;j++){

                for(int x=j+1;x<=k;x++){

                }
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        int n1[]={1,3,3,2};
        int n2[]={2,1,3,4};
        int k=3;
        long res=maxScore(n1, n2,k);
        System.out.println("Final Result: " + res);
    }
}
