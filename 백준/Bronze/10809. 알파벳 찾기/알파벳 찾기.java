import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int[] A = new int[123];

        for (int i = 97; i < 123; i++) {
            A[i] = -1;
        }
        for (int i = s.length() - 1; i >= 0; i--) {
            int c = s.charAt(i);
            A[c] = i;
        }
        for (int i = 97; i < 123; i++) {
            System.out.print(A[i] + " ");


        }
    }
}