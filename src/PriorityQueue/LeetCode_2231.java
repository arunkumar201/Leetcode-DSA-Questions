package PriorityQueue;

import java.util.Arrays;
import java.util.PriorityQueue;

public class LeetCode_2231 {
    public static  int largestInteger(int num) {
        if(num<=10) return num;
        PriorityQueue<Integer> pq_even=new PriorityQueue<Integer>((a,b)->b-a);
        PriorityQueue<Integer> pq_odd=new PriorityQueue<Integer>((a,b)->b-a);
       int t=num;
       int ans=0;
        while(t!=0) {
            int last = t % 10;
            if (last % 2 == 0) pq_even.add(last);
            else pq_odd.add(last);
            t /= 10;
        }
        char ch[]=String.valueOf(num).toCharArray();
        for(int i=0;i<ch.length ;i++){
            ans*=10;
            if((ch[i]-'0')%2==0) {
                ans+=pq_even.poll();
            }else{
                ans+=pq_odd.poll();
            }
        }
        return ans;
       }
    public static void main(String[] args) {
        int num = 65875;
        int res=largestInteger(num);
        System.out.println(res);
    }
}
