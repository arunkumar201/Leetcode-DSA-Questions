public class LeetCode_67 {

    public static  String addBinary_Not_Working(String a, String b) {
       int n1=a.length();
       int n2=b.length();
       String res="";
       if(n1==1 && n2==1){
           Character ch1=a.charAt(0);
           Character ch2=b.charAt(0);
           if(ch1.equals('0') && ch2.equals('1') || ch1.equals('1') && ch2.equals('0')){
               return "1";
           }else if(ch1.equals('0') && ch2.equals('0')){
               return "0";
           }else{
               return "10";
           }
       }
       int i=n1-1;
       int j=n2-1;
       Character c='0';
       while(i>=0 && j>=0){
           Character ch1=a.charAt(i);
           Character ch2=b.charAt(j);
           if((ch1.equals('0') && ch2.equals('1')) || (ch1.equals('1') && ch2.equals('0'))){
               if(c.equals('0')){
                   res=res+'1';
               }
               else{
                   res=res+'0';
                   c='1';
               }
                i--;
               j--;
           }else if(ch1.equals('0') && ch2.equals('0')){
              if(c.equals('1')){
                  res=res+'1';
                  c='0';
              }
               else {
                   res=res+'0';
                   c='0';
              }
               j--;
               i--;
           }else{
               if (c.equals("0")) {
                   res=res+'0'+c;
               }else{
                   res=res+'1'+c;
               }
               c='1';
               j--;
               i--;
           }
       }

       return res;
    }
    public static  String addBinary(String a, String b){
        int num1 = Integer.parseInt(a,2);
        int num2 = Integer.parseInt(b,2);
        int res=num1+num2;
        return Integer.toBinaryString(res);
    }
    public static void main(String[] args) {
        String a="10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101";
        String b="1";
        String res=addBinary(a,b);
        System.out.println("Final result: " + res);
    }
}
