import java.util.*;
class Solution {
       public static String rotation(String s) {
        return s.substring(1) + s.charAt(0);
    }
    
    public static boolean check(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else if (c == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            } else if (c == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop();
            } else if (c == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop();
            } else {
                return false;
            }
        }

        return stack.isEmpty();
        }
    public int solution(String s) {
        int answer = 0;
        if (check(s)) {
            answer++;
        }

        for (int x = 1; x < s.length(); x++) {
            s = rotation(s);
            if (check(s)) {
                answer++;
            }
        }

        return answer;
    }
}