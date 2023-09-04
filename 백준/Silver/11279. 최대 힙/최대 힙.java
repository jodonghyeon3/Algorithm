import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(br.readLine());
            if (pq.isEmpty() && num == 0) {
                System.out.print("0\n");
            } else if (num == 0) {
                Integer remove = pq.poll();
                System.out.print(remove + "\n");
            } else {
                pq.offer(num);
            }
        }
        
    }
}
