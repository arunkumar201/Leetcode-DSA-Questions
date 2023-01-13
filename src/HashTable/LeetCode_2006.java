package HashTable;

import java.util.Arrays;

public class LeetCode_2006 {

    public static  int countKDifference(int[] a, int k) {
       int n=a.length;

       if(n<2) return 0;
       int count=0;
       for(int i=0; i<n; i++){
             for(int j =i+1;j<n;j++){
                 if(Math.abs(a[j]-a[i])==k){
                     count++;:qww
                 }
             }
       }
       return count;
    }

    public static void main(String[] args) {
        int [] nums ={3,2,1,5,4};
        int k=1;
        int res=countKDifference(nums, k);
        System.out.println("Final Result : " + res);
    }
}
