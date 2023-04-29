import java.util.*;
class Solution {
    public String solution(int[] numbers) {
         String[] nums = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            nums[i] = Integer.toString(numbers[i]);
        }
        
        Arrays.sort(nums, new Comparator<String>() {
            public int compare(String a, String b) {
                String order1 = a + b;
                String order2 = b + a;
                return order2.compareTo(order1);
            }
        });
        
        StringBuilder sb = new StringBuilder();
        for (String s : nums) {
            sb.append(s);
        }

        while (sb.length() > 1 && sb.charAt(0) == '0') {
            sb.deleteCharAt(0);
        }
        
        return sb.toString();
    }
}