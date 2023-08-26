import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {

    public static void main(String[] args) throws IOException {

        Deque<Integer> stack = new ArrayDeque<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int num2 = 1;
        boolean check = true;
        StringBuilder oper = new StringBuilder();

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(br.readLine());

            while (num2 <= num) {
                stack.push(num2);
                oper.append("+\n");
                num2++;
            }

            if (!stack.isEmpty() && stack.peek() == num) {
                stack.pop();
                oper.append("-\n");
            } else {
                check = false;
                break;
            }
        }

        if (check) {
            System.out.println(oper);
        } else {
            System.out.println("NO");
        }
    }
}
