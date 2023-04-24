import java.util.*;
class Solution {
    public int[] solution(int[] answers) {
          List<Integer> one = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        List<Integer> two = new ArrayList<>(Arrays.asList(2,1,2,3,2,4,2,5));
        List<Integer> thr = new ArrayList<>(Arrays.asList(3,3,1,1,2,2,4,4,5,5));



        if(one.size() < answers.length) {
            int idx = 0;
            for (int i = one.size(); i < answers.length; i++) {
                one.add(i, one.get(idx++));
            }
        }
        if(two.size() < answers.length) {
            int idx = 0;
            for (int i = two.size(); i < answers.length; i++) {
                two.add(i, two.get(idx++));
            }
        }
        if(thr.size() < answers.length) {
            int idx = 0;
            for (int i = thr.size(); i < answers.length; i++) {
                thr.add(i, thr.get(idx++));
            }
        }

        int oneN = 0;
        int twoN = 0;
        int thrN = 0;

        for(int i = 0; i < answers.length; i++) {
            if (answers[i] == one.get(i)) {
                oneN++;
            }
            if (answers[i] == two.get(i)) {
                twoN++;
            }
            if (answers[i] == thr.get(i)) {
                thrN++;
            }
        }

        int max = Math.max(oneN, Math.max(twoN, thrN));
        List<Integer> winners = new ArrayList<>();
        if (oneN == max) {
            winners.add(1);
        }
        if (twoN == max) {
            winners.add(2);
        }
        if (thrN == max) {
            winners.add(3);
        }

        int[] result = new int[winners.size()];
        for (int i = 0; i < winners.size(); i++) {
            result[i] = winners.get(i);
        }
        return result;
    }
}