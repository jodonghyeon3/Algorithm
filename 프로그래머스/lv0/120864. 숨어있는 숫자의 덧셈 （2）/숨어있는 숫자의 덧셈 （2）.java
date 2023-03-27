class Solution {
    public int solution(String my_string) {
        String[] answer = my_string.split("[a-z,A-Z]");
        int sum = 0;
        for (int i = 0; i < answer.length; i++) {
            if (answer[i].equals("")) {
                continue;
            } else {
                sum += Integer.parseInt(answer[i].trim());
            }
        }
        return sum;
    }
}