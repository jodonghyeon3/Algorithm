import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String sb = br.readLine();
        int cnt = 0;
        if (sb.equals(" ")) {
            System.out.print("0");
        } else {
            for (int i = 0; i < sb.length(); i++) {
                if (sb.charAt(i) == ' ' && i != 0 && i != sb.length() -1) {
                    cnt++;
                }
            }
            System.out.println(cnt + 1);    
        }
        
    }
}