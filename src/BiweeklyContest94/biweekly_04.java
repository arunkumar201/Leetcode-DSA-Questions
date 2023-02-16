//package BiweeklyContest94;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.HashMap;
//import java.util.HashSet;
//
//public class biweekly_04 {
////    public static int maxCount(int[] banned, int n, int maxSum) {
////        HashMap<Integer,Integer> mp=new HashMap<Integer,Integer>();
////        for(int x: banned){
////            mp.put(x,mp.getOrDefault(x,0)+1);
////        }
////        int count=0;
////        int sum=0;
////        for(int i=1;i<=n;i++)
////        {    sum+=i;
////            if(!arr.contains(i) && sum<=maxSum && !hs.contains(i)){
////                count++;
////               hs.add(i);
////            }
////        }
////         return count;
////    }
//    public int maximizeWin(int[] prizePositions, int k) {
//             int i=0;
//             int j=0;
//             int sum=0;
//              int x=prizePositions.length;
//              while(j<x){
//
//              }
//
//    }
//
//
//    public static int[] separateDigits(int[] a) {
//      ArrayList<Integer> li=new ArrayList<>();
//      for (int k = 0; k < a.length; k++) {
//
//          if (a[k] < 10) {
//              li.add(a[k]);
//          } else if (a[k] >= 10) {
//              String number = String.valueOf(a[k]);
//              for(int i = 0; i < number.length(); i++) {
//                  int j = Character.digit(number.charAt(i), 10);
//                  li.add(j);
//              }
//          }
//      }
//      int res[]=new int[li.size()];
//      for(int x=0; x<li.size(); x++) {
//          res[x]=li.get(x);
//      }
//      return res;
//    }
//    public static void main(String[] args) {
////int a[]={13,25,83,77};
// int []banned = {1,6,5};
// int n=5, maxSum = 6;
////        System.out.println("Final Ans is " +maxCount(banned,n,maxSum));
////        System.out.println("FInal Result is "+ Arrays.toString(separateDigits(a)));
//    }
//}
