package GFG;

import java.util.HashMap;
import java.util.HashSet;

public class Make_Array_Elements_Unique {
    public static long minIncrements(int[] a, int n) {
        long res=0;
        HashMap<Integer,Integer> mp=new HashMap<Integer,Integer>();
        for(int i=0;i<n;i++){
            while(mp.containsKey(a[i])){
                a[i]+=1;
                res++;
            }
            mp.put(a[i],1);
        }
        return res;
    }

    static long countPairs(int n, int[] arr, int k) {
        long count=0;
      HashMap<Integer, Integer> mp=new HashMap<Integer, Integer>();
//      for(int i : arr){
//          mp.put(i,i%k);
//      }

     for(int i=0;i<n;i++){
          int r=arr[i]%k;
          if(mp.containsValue(r)){
              count++;
          }
       }
        return count;
        }

    public static void main(String[] args) {
//        long res=minIncrements(a, a.length);
        int arr[] = {3,7,11};
        int k = 4;
        long res=countPairs(arr.length,arr, k);
        System.out.println("Final res = " + res);

    }
}

