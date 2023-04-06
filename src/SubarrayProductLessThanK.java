public interface SubarrayProductLessThanK {
    public static int numSubarrayProductLessThanK(int[] a, int k) {
        int n = a.length;
        if (n == 0) {
            return 0;
        }
        int start = 0;
        int end = 0;
        int product = 1;
        int count = 0;
        while (end < n) {
            product *= a[end];
            while (product >= k && start <= end) {
                product /= a[start];
                start++;
            }
            count += end - start + 1;
            end++;
        }
        return count;
    }


    public static void main(String[] args) {
        int a[]={10,5,2,6};
        int k=100;
        System.out.println(numSubarrayProductLessThanK(a,k));
    }
}
