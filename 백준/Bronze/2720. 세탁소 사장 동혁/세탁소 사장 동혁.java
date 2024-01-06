import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i = in.nextInt();
        int[] arr = {25, 10, 5, 1};
        for (int j = 0; j < i; j++) {
            int i1 = in.nextInt();
            while (i1 > 0) {
                for (int k = 0; k < arr.length; k++) {
                    System.out.print(i1 / arr[k] + " ");
                    i1 %= arr[k];
                }
            }
            System.out.println();
        }

    }
}