public class Question {

    public static int  getXored(int n,int k){
       int count=0;
        for(int i=1;i<=n;i++){
            if((i^k)>(i&k)) count++;
        }
        return count;
    }
    static int getLength(String str, int n) {
        int ans = 0;
        for (int i = 0; i <= n - 2; i++) {
            int l = i, r = i + 1;
            int lsum = 0, rsum = 0;
            while (r < n && l >= 0) {
                lsum += str.charAt(l) - '0';
                rsum += str.charAt(r) - '0';
                if (lsum == rsum) {
                    ans = Math.max(ans, r - l + 1);
                }
                l--;
                r++;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int n=2;
        int k=1;
        String x="1241424";
        System.out.println(getLength(x,7));
        int res=getXored(n,k);
        System.out.println("Final Result "+ res);
    }
}
