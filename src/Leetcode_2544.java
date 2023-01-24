public interface Leetcode_2544 {
    public static int alternateDigitSum(int n) {
        if(n<10) return n;
        int sum = 0;
        int sign=-1;
        while(n!=0) {
            sum += (n % 10)*(-1*sign);
            n /= 10;
            sign*=-1;
        }
        return sum*sign;
    }
    public static int alternateDigitSum_bruteForce(int n) {
         if(n<10) return n;
         int sum = 0;
         int sign=-1;
         String num=Integer.toString(n);
        System.out.println(num);
        for(int i=0;i<num.length();i++)
        {
            sum+=Integer.parseInt(String.valueOf(num.charAt(i)))*(-1*sign);
            sign*=-1;
        }
         return sum;
    }
    public static void main(String[] args) {
        int n=886996;
        int res=alternateDigitSum(n);
        System.out.println("Final result: " + res);
    }
}
