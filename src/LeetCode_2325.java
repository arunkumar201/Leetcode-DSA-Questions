import java.util.Arrays;
import java.util.HashMap;

public class LeetCode_2325 {

    public static String decodeMessage_BruteForce(String key, String message) {
        int len = key.length();
        String res="";
        HashMap<Character, Character> mp = new HashMap<>();
        char start='a';
        for (int i=0;i<len;i++) {
            if(!mp.containsKey(key.charAt(i)) && key.charAt(i) !=' ') {
                mp.put(key.charAt(i),start++);
            }
        }
        System.out.println(mp.toString());
        for(int i=0;i<message.length();i++) {
            if(message.charAt(i)==' '){
                res+=' ';
            }
            else if(mp.containsKey(message.charAt(i))) {
                res+=mp.get(message.charAt(i));
            }
        }
        return res;
    }

    public static String decodeMessage(String key, String message) {
        int a[]=new int[128];
        Arrays.fill(a,-1);
        char start=97;
        System.out.println('a'-32);
        for(int i=0;i<key.length();i++){
           int idx=key.charAt(i)-32;
//            System.out.println(idx);
            if(a[idx]==-1 && key.charAt(i)!=' '){
                a[idx]=start++;
            }
        }
        String res="";
        for(int i=0;i<message.length();i++){
            if(message.charAt(i) ==' '){
                res+=' ';
            }else{
                res+=(char)a[message.charAt(i)-32];
            }
        }
        System.out.println(Arrays.toString(a));
        return res;
    }
    public static void main(String[] args) {
   String key ="the quick brown fox jumps over the lazy dog";
   String message = "vkbs bs t suepuv";
        String res=decodeMessage(key,message);
        System.out.println("Final result: " + res);
    }
    }
