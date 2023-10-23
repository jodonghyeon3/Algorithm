import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        String next = sc.next();

        int cnt = next.length() / 2 ;
        int cntCheck = 0;
        for (int i = 0; i < next.length() / 2; i++) {
            if (next.charAt(i) == next.charAt(next.length() - 1 - i)) {
                cntCheck++;
            }
        }
        if (cnt == cntCheck) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }

    }
}