import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public static String[] solution(String[] str_list) {
        ArrayList<String> list = new ArrayList<>();
        boolean isL = false;
        int idx = -1;

        for (int i = 0; i < str_list.length; i++) {
            if (str_list[i].equals("l")) {
                idx = i;
                isL = true;
                break;
            } else if (str_list[i].equals("r")) {
                idx = i;
                break;
            }
        }

        if(isL && idx != -1) {
            for (int i = 0; i < idx; i++) {
                list.add(str_list[i]);
            }
        } else if (!isL && idx != -1){
            for (int i = idx + 1; i < str_list.length; i++) {
                list.add(str_list[i]);
            }
        }
        String[] answer = new String[list.size()];
        answer = list.toArray(answer);
        return answer;
    }

    public static void main(String[] args) {
        String[] str_list = {"u", "u"};
        System.out.println(Arrays.toString(solution(str_list)));

    }
}