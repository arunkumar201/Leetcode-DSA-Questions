package PriorityQueue;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class LeetCode_1046 {

    public static int lastStoneWeight_BruteForce(int[] stones) {
      int n=stones.length;
      if(n==0) return 0;
      if(n==1) return stones[0];

      //For each step we need to find the two max weights of the stones and
        //we Subtract first weight with second weight ,it will become new weight
        //like x=firstMaxWeight and Y=secondMaxWeight
        //when x==y then destroyed both weights means x=0,y=0 or remove from the array;
        //x!=y then x is destroyed means x=0 or remove from the array and y=abs(y-x);
        //Sort the weights in acscending order
        int i=0;
        Arrays.sort(stones);
       while(i<n){
            int FirstHeaviestStone=stones[n-1];
            int SecondHeaviestStone=stones[n-2];
            if(FirstHeaviestStone==SecondHeaviestStone){
                stones[n-1]=0;
                stones[n-2]=0;
            }
          else if(stones[n-1]>=stones[n-2] && FirstHeaviestStone!=SecondHeaviestStone){
                stones[n-1]=0;
                stones[n-2]=Math.abs(FirstHeaviestStone-SecondHeaviestStone);
            }
            Arrays.sort(stones);
            i++;
        }
        System.out.println(Arrays.toString(stones));
       return stones[n-1];
    }

    public static int lastStoneWeight(int[] stones) {
        int n = stones.length;
        if (n == 0) return 0;
        if (n == 1) return stones[0];
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>((a, b) -> b - a);
        for(int i: stones) pq.add(i);
        //or
//        PriorityQueue<Integer> pq=new PriorityQueue<Integer>(Collections.reverseOrder());
        while (pq.size() >1) {
            pq.add(pq.poll() - pq.poll());
        }
        return pq.poll();
    }
    public static void main(String[] args) {
//        int []stones ={2,7,5,12,34,57,455,33,4,6,78,8,87,66,7}; //ans=49
        int []stones={9,3,2,10};//0
        int res=lastStoneWeight(stones);
        System.out.println("Final res = " + res);
    }
}
