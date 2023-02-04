import java.util.Arrays;

public class Leetcode_6 {

    public static String convert(String s, int n) {
        if(s.isEmpty() || n==1) return s;
        char ch[]=new char[n];
        boolean down = false;
        int row=0;

        for(int i=0;i<s.length();i++) {
           if(row>=0){
               ch[row]+=s.charAt(i);
           }
           if(row==n-1){
               down = false;
           }
           else if(row==0){
               down = true;
           }
           if(!down){
               row--;
           }
           else{
               row++;
           }
        }
        String result = new String(ch);
        return result ;
    }

    public static void main(String[] args) {
        String s="PAYPALISHIRING";
        System.out.println(convert(s,3));
    }
}
