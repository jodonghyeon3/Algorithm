import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        int count = countCroatianAlphabet(input);
        System.out.println(count);

        scanner.close();
    }

    private static int countCroatianAlphabet(String input) {
        int count = 0;
        int length = input.length();

        for (int i = 0; i < length; i++) {
            char currentChar = input.charAt(i);

            if (currentChar == 'c' && i < length - 1) {
                char nextChar = input.charAt(i + 1);
                if (nextChar == '=' || nextChar == '-') {
                    i++;
                }
            } else if (currentChar == 'd' && i < length - 1) {
                char nextChar = input.charAt(i + 1);
                if (nextChar == 'z' && i < length - 2 && input.charAt(i + 2) == '=') {
                    i += 2;
                } else if (nextChar == '-') {
                    i++;
                }
            } else if ((currentChar == 'l' || currentChar == 'n') && i < length - 1) {
                char nextChar = input.charAt(i + 1);
                if (nextChar == 'j') {
                    i++;
                }
            } else if ((currentChar == 's' || currentChar == 'z') && i < length - 1) {
                char nextChar = input.charAt(i + 1);
                if (nextChar == '=') {
                    i++;
                }
            }

            count++;
        }

        return count;
    }
}