package GFG;

import java.util.*;
import java.util.stream.IntStream;

public class Amazon_HackerRank {
    public static  boolean isPalindrome(String s) {
        int n=s.length();
        if(s.equals(" ")){
            return true;
        }
        int l=0;
        int h=n-1;
        while(l<h){
            char c1=Character.toLowerCase(s.charAt(l));
            char c2=Character.toLowerCase(s.charAt(h));
            if(c1<97 || c1>122){
                l++;
            }
            if( c2<97 ||  c2>122){
                h--;
            }
            if((c1>=97 && c1<=122) && (c2>=97 && c2<=122) ){
                if(c1!=c2){
                    return false;
                }
                else{
                    l++;
                    h--;
                }
            }
            if((c1<97 || c1>122) && (c2<97 || c2>122)){
                       return false;
            }

        }
        return true;
    }
    public static void main(String[] args) {
//       String s="A man, a plan, a canal: Panama";
       String s="0P";
       boolean res=isPalindrome(s);
        System.out.println("Final res = " + res);
    }
}
