import java.lang.reflect.Array;
import java.util.*;

public class App {

    public static int[] leftRigthDifference(int[] a) {
             int n= a.length;
             if(n==1) return new int[]{0};
             int ans[]=new int[n];

        int left[]=new int[n+1];
        int right[]=new int[n+1];
  left[0]=0;
  for(int i=1;i<n;i++){
      left[i]+=left[i-1]+a[i-1];
  }
        System.out.println(Arrays.toString(left));
        right[n-1]=0;
        int j=n-1;
        for(int i=n-2;i>=0;i--){
            right[i]+=right[i+1]+a[j--];
        }
        System.out.println(Arrays.toString(right));
        for(int i=0;i<n;i++){
          ans[i]=Math.abs(left[i]-right[i]);
        }
        return null;
    }


    public static  double[] sampleStats(int[] count) {
                   ArrayList<Double> li=new ArrayList<Double>();
                   for(int i=0;i<count.length;i++){
                       if(i>0){
                           for(int j=0;j<i;j++){
                               li.add((double) i);
                           }
                       }
                   }
        double max=Collections.max(li);
        double min=Collections.min(li);
        Double[] numbers = li.toArray(new Double[0]);
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        double mean = (double) sum / numbers.length;
//        System.out.println("Mean value: " + mean);

        // Calculate the median value
        Arrays.sort(numbers);
        double median;
        if (numbers.length % 2 == 0) {
            median = (double) (numbers[numbers.length/2] + numbers[numbers.length/2 - 1]) / 2;
        } else {
            median = (double) numbers[numbers.length/2];
        }

        Double mode = Double.valueOf(0);
        int maxCount = 0;
        for (int i = 0; i < numbers.length; i++) {
            int count1 = 0;
            for (int j = 0; j < numbers.length; j++) {
                if (numbers[j] == numbers[i]) {
                    count1++;
                }
            }
            if (count1 > maxCount) {
                maxCount = count1;
                mode = numbers[i];
            }
        }
            double[] ans= new double[]{min, max, mean, median, mode};
            return ans;
    }

    public static void main(String[] args) {
        int nums[] = {10,4,8,3};
        int ans[]=leftRigthDifference(nums);
//        System.out.println(Arrays.toString(nums));
    }
}
