import java.util.*;

class Solution {
    public static int[] solution(int[] arr, int k) {
        ArrayList<Integer> list = isDuplicate(arr);

        int[] answer = new int[k];
        int size = Math.min(list.size(), k);

        for (int j = 0; j < size; j++) {
            answer[j] = list.get(j);
        }

        if (size < k) {
            Arrays.fill(answer, size, k, -1);
        }

        return answer;
    }

    public static ArrayList<Integer> isDuplicate(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(arr[0]);

        for (int i = 1; i < arr.length; i++) {
            boolean isDuplicate = false;

            for (int j = i - 1; j >= 0; j--) {
                if (arr[j] == arr[i]) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                list.add(arr[i]);
            }
        }

        return list;
    }
}