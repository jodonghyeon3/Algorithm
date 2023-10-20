import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int cnt = sc.nextInt();
        int[] A = new int[num + 1];
        for (int i = 0; i < A.length; i++) {
            A[i] = i;
        }

        for (int i = 0; i < cnt; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int tmp = A[a];
            A[a] = A[b];
            A[b] = tmp;
        }

        for (int i = 1; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }

    }

}