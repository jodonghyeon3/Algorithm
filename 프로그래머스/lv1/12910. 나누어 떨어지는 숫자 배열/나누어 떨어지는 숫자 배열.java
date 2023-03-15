// Array배열로만
import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int count = 0;
        
        for (int item : arr) {
            if (item % divisor == 0) {
                count++;
            }
        }
        
        if (count == 0) {
            int[] answer = {-1};
            return answer;
        }
        Arrays.sort(arr);
        int[] answer = new int[count];
        int i = 0;
        int j = 0;

        while (i < arr.length) {
            if (arr[i] % divisor == 0) {
                answer[j] = arr[i];
                j++;
            }
            i++;
        }
         return answer;
    }
}




//  ArrayList 이용
// import java.util.ArrayList;
// import java.util.Collections;
// class Solution {
//     public int[] solution(int[] arr, int divisor) {
//         boolean check = false;
//         ArrayList<Integer> list = new ArrayList<>();
//         for (int item : arr) {
//             if (item % divisor == 0) {
//                 list.add(item);
//                 check = true;
//             }
//         }
//         if(!check) {
//             list.add(-1);
//         }
//         Collections.sort(list);
//         int[] answer = new int[list.size()];
//         for (int i = 0; i < list.size(); i++) {
//             answer[i] = list.get(i);
//             }
//         return answer;
//     }
// }