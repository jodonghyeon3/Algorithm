import java.util.ArrayList;
import java.util.Arrays;

class Solution {

    public static int[] solution(int[] arr) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i]; j++) {
                list.add(arr[i]);
            }
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        int[] arr = {5, 1, 4};
        System.out.println(Arrays.toString(solution(arr)));
    }
}