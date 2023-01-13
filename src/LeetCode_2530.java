import java.util.Collections;
import java.util.PriorityQueue;

public class LeetCode_2530 {
    public static  long maxKelements(int[] a, int k) {
    long score=0;
    int n=a.length;
       // By default, the priority queue in Java is min Priority queue with natural ordering.
        ///We Need to Convert Max Queue
        PriorityQueue<Integer> pq=new  PriorityQueue<Integer>(Collections.reverseOrder());
        pq.add(10);
        pq.add(10);
        pq.add(10);
        int n1=pq.poll();
        pq.add(n1);
        System.out.println(pq);
        for(int j: a){
            pq.add(j);
        }
        while(pq.size()>0 && k>0){
            double mx=pq.poll();
            int r=(int)Math.ceil(mx/3);
            pq.add(r);
            score+=(int)mx;
            k--;
        }
        return score;
    }
    public static void main(String[] args) {
    int a[]= {10,10,10,10,10};
    int k = 5;
    long res=maxKelements(a,k);
    System.out.println("Final result: " + res);
    }
}
