import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] A = new int[9];
        int minVal = Integer.MIN_VALUE;
        int minIdx = -1;
        for (int i = 0; i < 9; i++) {
            A[i] = Integer.parseInt(br.readLine());
            if (minVal < A[i]) {
                minVal = A[i];
                minIdx = i + 1;
            }
        }
        System.out.println(minVal);
        System.out.println(minIdx);


    }



}