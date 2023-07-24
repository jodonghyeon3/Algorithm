import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = sc.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);

        int i = 0;
        int j = num - 1;
        int cnt = 0;
        while (i < j) {
            if (arr[i] + arr[j] < sum) {
                i++;
            } else if (arr[i] + arr[j] > sum) {
                j--;
            } else {
                cnt++;
                i++;
                j--;
            }
        }
        System.out.println(cnt);
        sc.close();
    }
}
