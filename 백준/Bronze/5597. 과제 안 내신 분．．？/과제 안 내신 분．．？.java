import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] A = new int[31];

        for (int i = 0; i < 28; i++) {
            int i1 = Integer.parseInt(br.readLine());
            A[i1] = 1;
        }

        for (int i = 1; i < A.length; i++) {
            if (A[i] != 1) {
                System.out.println(i + " ");
            }

        }

    }
}