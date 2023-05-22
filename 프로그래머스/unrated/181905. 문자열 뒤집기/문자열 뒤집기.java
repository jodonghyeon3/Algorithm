class Solution {
    public String solution(String my_string, int s, int e) {
        StringBuilder sb = new StringBuilder(my_string);
        StringBuilder sb1 = new StringBuilder(my_string.substring(s, e + 1));
        System.out.println(sb1);
        sb1.reverse();
        sb.replace(s, e + 1, sb1.toString());
        return sb.toString();
    }
}