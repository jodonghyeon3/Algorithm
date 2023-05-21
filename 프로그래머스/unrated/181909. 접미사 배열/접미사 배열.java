import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

class Solution {
    public static String[] solution(String my_string) {
        ArrayList<String> list = new ArrayList<>();
        String s = "";
        for (int i = 0; i < my_string.length(); i++) {
            list.add(my_string.substring(i, my_string.length()));
        }
        Collections.sort(list);
         String[] result = list.stream().toArray(String[]::new);
        return result;
    }
}