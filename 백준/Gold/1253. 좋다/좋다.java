import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        long[] arr = new long[num];
        int result = 0;
        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);

        for (int k = 0; k < num; k++) {
            long find = arr[k];
            int i = 0;
            int j = num - 1;
            while (i < j) {
                if (arr[i] + arr[j] == find) {
                    if (i != k && j != k) {
                        result++;
                        break;
                    } else if (i == k) {
                        i++;
                    } else if (j == k) {
                        j--;
                    }
                } else if (arr[i] + arr[j] < find) {
                    i++;
                } else {
                    j--;
                }
            }

        }
        System.out.println(result);
        sc.close();
    }
}
