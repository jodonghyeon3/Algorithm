import java.util.Stack;

class Solution
{
    public int solution(String s)
    {
         Stack stack = new Stack();
        for (int i =0; i < s.length(); i++) {
           if (stack.isEmpty()) {
                stack.add(s.charAt(i));
           } else if (stack.peek().equals(s.charAt(i))){
               stack.pop();
           } else {
               stack.add(s.charAt(i));
           }
       }
        return stack.isEmpty() ? 1 : 0;
     
    }
}