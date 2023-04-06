package BiweeklyContest94;

import java.util.*;
public class Biweekly98 {
        public static int minImpossibleOR(int[] nums) {
            Set<Integer> expressibles = new HashSet<>();
            expressibles.add(0);
            for (int num : nums) {
                Set<Integer> newExpressibles = new HashSet<>();
                newExpressibles.add(num);
                for (int exp : expressibles) {
                    newExpressibles.add(num | exp);
                }
                expressibles.addAll(newExpressibles);
            }
            int unexpressible = 1;
            while (expressibles.contains(unexpressible)) {
                unexpressible++;
            }
            return unexpressible;
        }
    public static void main(String[] args) {
        System.out.println(minImpossibleOR((new int[]{2,1})));
    }
}
