import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;

public class Question_01 {

//    public static boolean wordPattern(String pattern, String s) {
//        String st[]=s.split(" ");
//        char[] p=pattern.toCharArray();
//        int n=p.length;
//        if(st.length!=p.length){
//            return false;
//        }
//        int i=0;
//        int j=n-1;
//        HashSet<String> set=new HashSet<String>();
//        while(j>i){
//            if(p[i]==p[j]){
//                if(st[i].equals(st[j]) && !set.contains(st[i])){
//                    i++;
//                    j--;
//                }else{
//                    return false;
//                }
//            }
//            else if(p[i]!=p[j] && !set.contains(st[i])){
//                if(st[i]!=st[j]){
//                    j--;
//                    i++;
//                }else{
//                    return false;
//                }
//              set.add(st[i]);
//            }
//        }
//        return true;
//    }


    public static  int minDeletionSize(String[] str) {
        int n=str.length;
        int count=0;
        int z=str[0].length();
        for(int k=0;k<z;k++){
             char c1=str[0].charAt(k);
            for(int i=0;i<str.length;i++){
                Character c2=str[i].charAt(k);
                int c =Character.compare(c2, c1);
                if(c<0){
                    count++;
                    break;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String pattern[] = {"cba","daf","ghi"};
       int res=minDeletionSize(pattern);
        System.out.println("Final result: " + res);
    }
}
