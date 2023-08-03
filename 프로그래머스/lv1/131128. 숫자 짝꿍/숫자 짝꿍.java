import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static String solution(String X, String Y) {
        Map<Character, Integer> countX = new HashMap<>();
        Map<Character, Integer> countY = new HashMap<>();

    
        for (char digit : X.toCharArray()) {
            countX.put(digit, countX.getOrDefault(digit, 0) + 1);
        }
        for (char digit : Y.toCharArray()) {
            countY.put(digit, countY.getOrDefault(digit, 0) + 1);
        }

        StringBuilder result = new StringBuilder();
        
    int cnt = 0;
        for (char digit = '9'; digit >= '0'; digit--) {
            if (countX.containsKey(digit) && countY.containsKey(digit)) {
                int minCount = Math.min(countX.get(digit), countY.get(digit));
                for (int i = 0; i < minCount; i++) {
                    if (digit == '0') cnt++;
                    result.append(digit);
                }
            }
        }

        if (result.length() == 0) {
            return "-1";
        } else if (result.length() == cnt) {
            return "0";
        }

        return result.toString();
    }

}
