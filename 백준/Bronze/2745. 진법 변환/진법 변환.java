import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int N = in.nextInt();
        int ans = 0;
        int B = 1;

        for(int i=s.length()-1; i>=0; i--) {
            char c = s.charAt(i);
            if('A'<=c && c<='Z') {
                c -= 55;
            }
            else {
                c -= 48;
            }

            ans += c*B;
            B *= N;
        }
        System.out.println(ans);
    }
}