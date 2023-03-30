import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int fir = sc.nextInt();
        int sec = sc.nextInt();
        int thi = sc.nextInt();

        sc.close();
        int money = 0;
        if (fir == sec && fir == thi) {
            money = fir * 1000 + 10000;
        } else if (fir == sec || sec == thi) {
            money = sec * 100 + 1000;
        } else if (fir == thi) {
            money = fir * 100 + 1000;
        } else {
            money = Math.max(fir, Math.max(sec, thi)) * 100;
        }
        System.out.println(money);
    }
}