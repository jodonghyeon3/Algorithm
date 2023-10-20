import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int main = sc.nextInt();
        for (int i = 0; i < num; i++) {
            int i1 = sc.nextInt();
            if (main > i1) {
                System.out.print(i1 + " ");
            }
        }


    }



}