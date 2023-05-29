import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public static String[] solution(String[] strArr) {
        List<String> resultList = new ArrayList<>();

        for (String str : strArr) {
            if (!str.contains("ad")) {
                resultList.add(str);
            }
        }

        return resultList.toArray(new String[0]);
    }
}
