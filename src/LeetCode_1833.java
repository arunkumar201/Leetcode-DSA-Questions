import java.util.Arrays;

public class LeetCode_1833 {

    public static int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int n=costs.length;
        int count = 0;
//1,3,2,4,1
        //After Sorting
        //1,1,2,3,4
        int i=0;
        if (costs[i] > coins) return 0;
       while(coins>0 && i<n && costs[i]<=coins) {
           System.out.println(coins);
                coins -= costs[i];
                count++;
                i++;
       }
        return count;
    }

    public static void main(String[] args) {
        int a[]={7,3,3,6,6,6,10,5,9,2};
        int coins=56;
        int res=maxIceCream(a, coins);
        System.out.println("Final result is " + res);
    }
}
