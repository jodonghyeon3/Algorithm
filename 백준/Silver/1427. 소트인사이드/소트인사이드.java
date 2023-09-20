import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String token = st.nextToken();

        int[] arr = new int[token.length()];
        for (int i = 0; i < token.length(); i++) {
            arr[i] = token.charAt(i) - '0';
        }

        for (int i = 0; i < arr.length; i++) {
            int max = arr[i];
            int idx = -1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > max) {
                    max = Math.max(max, arr[j]);
                    idx = j;
                }
            }

            if (idx != -1) {
                int tmp = arr[i];
                arr[i] = arr[idx];
                arr[idx] = tmp;
            }

        }

        for (int a : arr) {
            System.out.print(a);
        }
    }
}
