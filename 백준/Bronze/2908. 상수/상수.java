import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb1 = new StringBuilder(sc.next());
        StringBuilder sb2 = new StringBuilder(sc.next());
        sb1.reverse();
        sb2.reverse();
        System.out.println(Math.max(Integer.parseInt(sb1.toString()), Integer.parseInt(sb2.toString())));


    }
}