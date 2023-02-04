public class SecondLargestItem {

    static int getSecondLargestItem(int[] arr) {
        int n=arr.length;
        //if array Length is less than 2 then,there is no second largest item
        if(n<3){
            return -1;
        }
        int F_max=Integer.MIN_VALUE;  //First-largest item in an array
        int S_max=Integer.MIN_VALUE;  //Second-largest item in an array
        for(int i=0;i<n;i++){
            if(arr[i]>F_max){
                S_max=F_max;
                F_max=arr[i];
            }
           else if(arr[i]>S_max && arr[i]!=F_max){
                S_max=arr[i];
            }
        }
        return S_max;
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,7,7,7,6};
        int SecondLargestItem=getSecondLargestItem(arr);
        System.out.println("The Second Largest Item in array is " + SecondLargestItem);
    }
}
