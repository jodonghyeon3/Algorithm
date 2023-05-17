class Solution {
    public int solution(int[] num_list) {
        StringBuilder sbEven = new StringBuilder();
        StringBuilder sbOdd = new StringBuilder();
        for (int i = 0; i < num_list.length; i++) {
            if (num_list[i] % 2 == 1) sbOdd.append(num_list[i]);
            else sbEven.append(num_list[i]);
        }
        return Integer.parseInt(sbOdd.toString()) + Integer.parseInt(sbEven.toString());
    }
}