import java.util.Arrays;
import java.util.HashMap;

public class LeetCode_290 {
    public static  boolean wordPattern(String p, String s) {
          int n=p.length();
        String []words=s.split(" ");
        if(n!= words.length)  return false;
        HashMap<Character,String> mp=new HashMap<Character,String>();
        for(int i=0;i<n;i++) {
            if(!mp.containsKey(p.charAt(i))){

                if(mp.containsValue(words[i]))  return false;
                mp.put(p.charAt(i),words[i]);
            }
           else if(!mp.get(p.charAt(i)).equals(words[i])){
               return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String pattern = "abaa", s = "cat at cat cat";
        boolean res=wordPattern(pattern,s);
        System.out.println("Final result: " + res);
    }
}
