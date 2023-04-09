import java.util.*;
class Solution {
    public int solution(int[] array) {
     int max = Integer.MIN_VALUE;
        Arrays.sort(array);
        HashSet<Integer> set = new HashSet<>();
        int idx = 0;

        for (int item : array) {
            set.add(item);
        }

        int[] numArr = set.stream().mapToInt(Integer::intValue).toArray();

        for (int i = 0; i < numArr.length; i++) {
            int cnt =0;
            for (int j = 0; j < array.length; j++) {
                if (numArr[i] == array[j]) {
                    cnt ++;
                }
            }
            if (cnt > max) {
                idx = i;
                max = cnt;
            }
        }

        for (int i = 0; i < numArr.length; i++) {
            int cnt = 0;
            for (int j = 0; j < array.length; j++) {
                if (numArr[i] == array[j]) {
                    cnt ++;
                }
            }
            if (cnt == max && idx != i) {
                return -1;
            }
        }


        return numArr[idx];
}
}