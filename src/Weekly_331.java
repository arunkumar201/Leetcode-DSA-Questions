import java.util.*;

public class Weekly_331 {
//    public static long pickGifts(int[] a, int k) {
//        PriorityQueue<Long> pq=new PriorityQueue<Long>(Collections.reverseOrder());
//        long ans=0;
//        for(long x: a) pq.add(x);
//        System.out.println(pq);
//        while(k!=0) {
//            long max = pq.poll();
//            System.out.println(max);
//            long square_root = (long) Math.floor(Math.sqrt(max));
//            pq.add(square_root);
//            System.out.println(square_root);
//            k--;
//        }
//        int y=pq.size();
//        Iterator value = pq.iterator();
//        while (value.hasNext()) {
//            long z= (long) value.next();
//            ans+=z;
//        }
//        return ans;
//    }


    public static int minCapability(int[] a, int k) {
     int n=a.length;
     int min=Integer.MAX_VALUE;
     int l=0;
     int h=n-1;
     while(l<=h) {
         if(a[l]>a[h]){
            min=Integer.min(a[h],min);
             h--;
         }
         else if(a[l]<a[h]){
              l--;
              min=Integer.min(a[l],min);
         }
     }
     return min;
    }
    public static int[] vowelStrings(String[] a, int[][] queries) {
       int ans[]=new int[queries.length];
        HashSet<Character> hs=new HashSet<Character>();
        hs.add('a');
        hs.add('e');
        hs.add('i');
        hs.add('o');
        hs.add('u');

        int n = a.length;
        int[] prefix = new int[n];
        int[] suffix = new int[n];
        for (int i = 0; i < n; i++) {
            prefix[i] = hs.contains(a[i].charAt(0)) ? 1 : 0;
            suffix[i] = hs.contains(a[i].charAt(a[i].length() - 1)) ? 1 : 0;
        }
//        System.out.println(Arrays.toString(suffix));
//        System.out.println(Arrays.toString(prefix));
        for (int i = 1; i < n; i++) {
            prefix[i] += prefix[i - 1];
            suffix[i] += suffix[i - 1];
        }
        System.out.println(Arrays.toString(suffix));
        System.out.println(Arrays.toString(prefix));
  for(int k=0;k<queries.length ;k++){
      int left=queries[k][0];
      int right=queries[k][1];
      int count=prefix[right];

      if(left>0){
          count-=prefix[left-1];
      }
      ans[k] = count;
      int total = suffix[right];
      if (left > 0) {
          total -= suffix[left - 1];
      }
      ans[k] += total - count;
  }
  System.out.println(Arrays.toString(ans));
 return ans;
    }
    public static void main(String[] args) {
        int []gifts = {25,64,9,4,100};
        int k = 4;


//       String  []words = {"a","e","i"};
       String  []words2 = {"aba","bcb","ece","aa","e"};
       int [][]queries = {
                {0, 2},
                {0, 1},
                {2, 2}
        };

        int [][]queries1 = {
                {0, 2},
                {1, 4},
                {1, 1}
        };
//        System.out.println("Final ans "      +pickGifts(gifts, k));
//        System.out.println(vowelStrings(words2,queries1));

        int []nums1 = {2,3,5,9};
    int k1 = 2;
        System.out.println(minCapability(nums1,k1));

    }
}
