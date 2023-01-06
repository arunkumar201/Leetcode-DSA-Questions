package GFG;

import java.util.Arrays;

public class Search_In_A_Row_Column_Sorted_Matrix {
   static int  BinarySearch(int a[],int key){
        int low=0;
        int high= a.length-1;
        int index=-1;
       while (low <= high) {
           int mid = low  + ((high - low) / 2);
           if (a[mid] < key) {
               low = mid + 1;
           } else if (a[mid] > key) {
               high = mid - 1;
           } else if (a[mid] == key) {
               index = mid;
               break;
           }
       }
       return index;
    }

    static  boolean search(int matrix[][], int n, int m, int x)
    {
        int i=0;
        int j=m-1;
//        System.out.println(n);
//        System.out.println(m);
//        18, 21, 27, 38, 55, 67
        while(i<n && j>=0){
            int a[]=matrix[i];
           int idx= BinarySearch(a,x);
           if(a[idx]==x) return true;
           else if(idx==-1) i++;
        }
        return false;
    }


    public static void main(String[] args) {
        int a[][]={
                 {18, 21, 27, 38, 55, 67}
        };
        int x=55;
        boolean res=search(a,a.length,a[0].length,x);
        System.out.println("Final result: " + res);
    }
}
