import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Solution {
    public static String[] solution(String myString) {
        String[] array = myString.split("x");
        List<String> resultList = new ArrayList<>();

        for (String str : array) {
            if (!str.isEmpty()) {
                resultList.add(str);
            }
        }

        Collections.sort(resultList);
        String[] result = new String[resultList.size()];
        result = resultList.toArray(result);

        return result;
    }
}