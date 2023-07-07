import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();
        int question = sc.nextInt();

        int[] dataArr = new int[data + 1];
        int[] sumArr = new int[data + 1];
        for (int i = 1; i < data + 1; i++) {
            dataArr[i] = sc.nextInt();
            sumArr[i] += dataArr[i] + sumArr[i - 1];
        }


        for (int i = 0; i < question; i++) {
            int fir = sumArr[sc.nextInt() - 1];
            int sec = sumArr[sc.nextInt()];
            System.out.println(sec - fir);
        }
        sc.close();

    }

}
