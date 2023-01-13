import java.util.HashMap;
import java.util.Map;
import java.util.logging.Handler;

public class LeetCode_2531 {
    public static boolean isItPossible(String word1, String word2) {

        HashMap<Character,Integer> mp1=new HashMap<Character,Integer>();
        HashMap<Character,Integer> mp2=new HashMap<Character,Integer>();
        int n=word1.length();
        int m=word2.length();
        for(int i=0;i<n;i++)mp1.put(word1.charAt(i), mp1.getOrDefault(word1.charAt(i), 0)+1);
        for(int i=0;i<m;i++)mp2.put(word2.charAt(i), mp2.getOrDefault(word2.charAt(i), 0)+1);
        System.out.println(mp1);
        System.out.println(mp2);
        if((Math.abs(mp1.size()-mp2.size())==1) && mp1.size()==1 || mp2.size()==1){
            return false;
        }
        int x=0;
        if(mp1.size()>mp2.size()){
            for(Map.Entry<Character,Integer> m1:mp2.entrySet()){
                if(m1.getValue()>=2){
                    x=m1.getKey();
                    break;
                }
            }
            char s=(char)x;
            for(Map.Entry<Character,Integer> m2:mp1.entrySet()){
                if(m2.getKey()!=s && m2.getValue()>=2){
                    return true;
                }
            }
            return false;
        }
       else if(mp2.size()>mp1.size()){
            int y=0;
            for(Map.Entry<Character,Integer> m1:mp1.entrySet()){
                if(m1.getValue()>=2){
                    y=m1.getKey();
                    break;
                }
            }
            if(y==0) return false;
            char s=(char)y;
            for(Map.Entry<Character,Integer> m2:mp2.entrySet()){
                if(m2.getKey()!=s && m2.getValue()>=2){
                    return true;
                }
            }
        }
       if(mp1.size()==mp2.size()) return false;
        return false;
    }
    public static void main(String[] args) {
       String word1 = "aa", word2 = "bb";
       boolean res=isItPossible(word1, word2);
        System.out.println("Final result: " + res);
    }
}
