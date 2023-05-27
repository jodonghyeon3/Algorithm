class Solution {
    public static String solution(String my_string, String alp) {
        my_string = my_string.replace(alp.charAt(0), (char) (alp.charAt(0) - (char) 32));
        return my_string;
    }
}