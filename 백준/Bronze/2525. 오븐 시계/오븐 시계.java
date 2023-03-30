import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int hour = sc.nextInt();
        int minute = sc.nextInt() + sc.nextInt();
        if (minute > 59) {
            hour += minute / 60;
            minute %= 60;
            hour %= 24;

        }
        if (minute > 9) {
            System.out.println(hour + " " + minute);
        } else {
            System.out.println(hour + " " + minute);
        }
    }
}