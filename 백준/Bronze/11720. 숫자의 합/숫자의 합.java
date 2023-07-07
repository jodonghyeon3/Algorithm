import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        char[] arr = sc.next().toCharArray();
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            result += arr[i] - '0';
        }
        System.out.println(result);
    }

}
