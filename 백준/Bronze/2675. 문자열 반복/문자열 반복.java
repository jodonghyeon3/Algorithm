import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        for (int i = 0; i < cnt; i++) {
            int iter = sc.nextInt();
            String s = sc.next();
            for (int j = 0; j < s.length(); j++) {
                for (int k = 0; k < iter; k++) {
                    System.out.print(s.charAt(j) + "");
                }
            }
            System.out.println();
        }
    }
}