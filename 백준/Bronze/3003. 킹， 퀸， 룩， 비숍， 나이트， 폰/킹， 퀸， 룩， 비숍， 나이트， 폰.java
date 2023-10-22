import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int[] arr = {1, 1, 2, 2, 2, 8};
        int[] answer = new int[6];

        for (int i = 0; i < arr.length; i++) {
            int a = sc.nextInt();
            answer[i] = arr[i] - a;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(answer[i] + " ");
        }


    }
}