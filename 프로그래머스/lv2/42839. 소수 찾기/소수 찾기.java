import java.util.*;
class Solution {
    public int solution(String numbers) {
        List<Integer> primes = new ArrayList<>();
        generatePrimes("", numbers, primes);
        return primes.size();
    }

    private static void generatePrimes(String prefix, String remaining, List<Integer> primes) {
        if (!prefix.isEmpty()) {
            int num = Integer.parseInt(prefix);
            if (isPrime(num) && !primes.contains(num)) {
                primes.add(num);
            }
        }

        for (int i = 0; i < remaining.length(); i++) {
            String newPrefix = prefix + remaining.charAt(i);
            String newRemaining = remaining.substring(0, i) + remaining.substring(i + 1);
            generatePrimes(newPrefix, newRemaining, primes);
        }
    }

    private static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}