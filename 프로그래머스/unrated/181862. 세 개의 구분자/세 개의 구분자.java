import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public static String[] solution(String myStr) {
        ArrayList<String> list = new ArrayList<>();
        String s = "";
        for (int j = 0; j < myStr.length(); j++) {
            if (myStr.charAt(j) == 'a' || myStr.charAt(j) == 'b' || myStr.charAt(j) == 'c') {
                if(!s.equals("")) {
                    list.add(s);
                }
                s = "";
            } else {
                s += myStr.charAt(j);
            }
            if (j == myStr.length() - 1) list.add(s);
        }

        if(list.isEmpty() || list.get(0).equals("")) {
            return new String[] {"EMPTY"};
        } else {
            String[] answer = new String[list.size()];
            for (int i = 0; i < answer.length; i++) {
                answer[i] = list.get(i);
            }
            return answer;
        }
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution("baconlettucetomato")));
    }
}