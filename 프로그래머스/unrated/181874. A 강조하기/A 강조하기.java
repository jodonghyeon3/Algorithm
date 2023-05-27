class Solution {
    public String solution(String myString) {
        StringBuffer sb = new StringBuffer(myString.toLowerCase());
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == 'a') sb.replace(i, i + 1, "A");
        }
        return sb.toString();
    }
}