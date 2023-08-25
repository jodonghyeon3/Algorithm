import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        Deque<Integer> deque = new LinkedList();
        int n = Integer.parseInt(st.nextToken());

        for (int i = 1; i <= n; i++) {
            deque.add(i);
        }

        while (deque.size() != 1) {
            deque.removeFirst();
            deque.add(deque.removeFirst());
        }
        System.out.println(deque.peek());
    }

}