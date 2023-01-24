import java.util.HashSet;
import java.util.PriorityQueue;

public class LeetCode_2540 {

    static boolean isContain(int[] a, int target) {
        //Binary Search
        int l = 0;
        int h = 0;
        while (l <= h) {
            int mid = l + (h - l) / 2;
            if (a[mid] == target) {
                return true;
            }
            if (a[mid] > target) {
                h = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return false;
    }

    public static int getCommon_BruteForce(int[] n1, int[] n2) {
        int res=Integer.MAX_VALUE;
        for (int i : n1) {
            if (isContain(n2, i)) {
                res=Math.min(res,i);
            }
        }
        if(res==Integer.MAX_VALUE) return -1;
        return res;
    }

    public  static  int getCommon_GoodSolution(int []n1, int []n2) {
        int j = 0;
        int i = 0;
        while (i < n1.length && j < n2.length) {
            if (n1[i] == n2[j]) return n1[i];
            if (n1[i] > n2[j]) j++;
            else i++;
        }
        return -1;
    }

    static int getResult(int []n1,int []n2){
        PriorityQueue<Integer> pq=new PriorityQueue<Integer>();
        for (int i : n2) {
            pq.add(i);
        }
        for(int j:n1){
            if( !pq.isEmpty() && pq.poll()==j) return j;
        }
        return -1;
    }
    public  static  int getCommon_GoodSolution1(int []n1, int []n2){
        if(n1[0]==n2[0])  return n1[0];
        if(n1[0]>n2[0])  return getResult(n2, n1);
        else return getResult(n1, n2);
    }
    static int getAnswer(int []n1, int []n2){
        HashSet<Integer> hs=new HashSet<Integer>();
        for(int i: n2){
            hs.add(i);
        }
        for(int j: n1){
            if(hs.contains(j)){
                return j;
            }
        }
        return -1;
    }
    public  static  int getCommon(int []n1, int []n2) {
        if(n1[0]==n2[0])  return n1[0];
        if(n1[0]>n2[0])  return getAnswer(n2, n1);
       else return getAnswer(n1, n2);
    }

    public static void main(String[] args) {
        int num1[] = {2,4};
        int num2[] = {1,2};
        int res = getCommon_GoodSolution1(num1, num2);
        System.out.println("Final result: " + res);
    }
}
