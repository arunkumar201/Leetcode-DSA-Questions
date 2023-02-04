import java.util.Arrays;
import java.util.function.BinaryOperator;

public class LeetCode_457 {
    static int[] pair =new int[]{-1,-1};
    public static boolean circularArrayLoop(int[] a) {
return true;
    }
    public static int findRadius_BruteForce(int[] houses, int[] heaters) {
          Arrays.sort(houses);
          Arrays.sort(heaters);
          int radius =Integer.MIN_VALUE;
          int diff=Integer.MAX_VALUE;
          for(int k=0;k<houses.length;k++) {
               for(int l=0;l< heaters.length;l++) {
                   int  x=Math.abs(houses[k]-heaters[l]);
                   diff=Math.min(diff,x);
               }
              radius = Math.max(diff,radius);
               diff=Integer.MAX_VALUE;
          }
          return radius;
    }
    static int[] Binary_Search(int t,int[] a){
        int l=0;
        int h=a.length-1;
        while(l<=h){
            int mid=l+(h-l)/2;
            if(a[mid]==t){
                pair[0]=a[mid];
                pair[1]=a[mid];
                break;
            }
            if(a[mid]<t){
               pair[0]=a[mid];
                l=mid + 1;
            }else{
                pair[1]=a[mid];
              h=mid -1;
            }
        }
        return pair;
    }

    public static int findRadius(int[] houses, int[] heaters){
        Arrays.sort(heaters);
        int radius =Integer.MIN_VALUE;
        for(int i=0;i<houses.length; i++){
            int housePos=houses[i];
            pair= Binary_Search(housePos,heaters);
            int dis1=(pair[0]==-1) ? Integer.MAX_VALUE : housePos-pair[0];
            int dis2=(pair[1]==-1) ? Integer.MAX_VALUE : pair[1]-housePos;
            radius=Math.min(dis1,dis2);
        }
       return radius;
    }
    public static void main(String[] args) {
        int a[]={1,-1,5,1,4};
        int houses[]={3,9,2,4,11};
        int heaters[]={1,8,5};
        int minRadius=findRadius(houses,heaters);
        System.out.println("minRadius is " + minRadius);
        boolean res=circularArrayLoop(a);
        System.out.println("Final result: " + res);
    }
}
