package HashTable;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class LeetCode_2006 {

    public static  int countKDifference_BruteForce(int[] a, int k) {
       int n=a.length;

       if(n<2) return 0;
       int count=0;
       for(int i=0; i<n; i++){
             for(int j =i+1;j<n;j++){
                 if(Math.abs(a[j]-a[i])==k){
                     count++;
                 }
             }
       }
       return count;
    }
    public static  int countKDifference(int[] a, int k) {
        int n = a.length;
        if (n < 2) return 0;
        HashMap<Integer, Integer> mp=new HashMap<Integer, Integer>();
        int count = 0;
        for(int j:a){
            if(mp.containsKey(j+k)) count=mp.get(j+k);
             if(mp.containsKey(j-k))count+=mp.get(j-k);
          mp.put(j,mp.getOrDefault(j,0)+1);
        }
        return count;
    }
    public static void main(String[] args) {
        int [] nums ={3,2,1,5,4};
        int k=2;
        int res=countKDifference(nums, k);
        System.out.println("Final Result : " + res);
    }
}
