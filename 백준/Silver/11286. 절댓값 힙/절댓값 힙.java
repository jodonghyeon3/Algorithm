import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> pq = new PriorityQueue<>((num1, num2) -> {
            int num1_abs = Math.abs(num1);
            int num2_abs = Math.abs(num2);
            if (num1_abs == num2_abs)
                return num1 > num2 ? 1 : -1;
            else
                return num1_abs - num2_abs;
        });
        for (int i = 0; i < n; i++) {
            int req = Integer.parseInt(br.readLine());
            if (req == 0) {
                if (pq.isEmpty())
                    System.out.println("0");
                else
                    System.out.println(pq.poll());
            } else
                pq.add(req);
        }
    }
}
