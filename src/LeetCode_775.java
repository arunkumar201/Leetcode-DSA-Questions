import java.util.Stack;

public class LeetCode_775 {

    public static boolean isIdealPermutation(int[] a) {
        if (a == null || a.length == 0) {
            return false;
        }
        int n= a.length;
        int gi=0;
        int li=0;
        for(int i=0; i<n; i++) {
             int temp=a[i];
            for(int j=n-1; j>=i; j--){
             if(temp>a[j]){
                 gi++;
             }
            }
        }
        for (int k = 0; k < n-1; k++) {
            if(a[k]>a[k+1]){
                li++;
            }
        }
        System.out.println(" gi "+gi+" li "+li );
        if(gi==li) return true;
  return false;
    }
    public static void main(String[] args) {
       int a[]={1,0,2};
        System.out.println(isIdealPermutation(a));
    }
}
