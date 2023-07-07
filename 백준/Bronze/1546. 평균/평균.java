import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] A = new int[N];

        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        double max = 0;
        double sum = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] > max) max = A[i];
            sum += A[i];
        }
        Double d = (double) (sum * 100 / max / N);
        System.out.print(d);
        sc.close();
    }

}
