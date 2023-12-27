import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String next = sc.next();
        String upperCase = next.toUpperCase();
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < upperCase.length(); i++) {
            map.put(upperCase.charAt(i), map.getOrDefault(upperCase.charAt(i), 0) + 1);
        }


        int max = Integer.MIN_VALUE;
        char a = '1';
        for (Character c : map.keySet()) {
            if (map.get(c) >= max) {
                max = Math.max(map.get(c), max);
                a = c;
            }
        }

        int checkCnt = 0;
        for (Character c : map.keySet()) {
            if (map.get(c) == max) {
                checkCnt++;
            }
        }

        if (checkCnt > 1) {
            a = '?';
            System.out.println(a);
        } else {
            System.out.println(a);
        }

    }
}