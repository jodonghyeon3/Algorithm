import java.util.Arrays;
import java.util.HashMap;

class Solution {
    public static String[] solution(String[] players, String[] callings) {
        HashMap<String, Integer> play = new HashMap<>();
        for (int i = 0; i < players.length; i++) {
            play.put(players[i], i);
        }

        for (String calling : callings) {
            int idx = play.get(calling);
            play.put(players[idx], idx - 1);
            play.put(players[idx - 1], idx);

            String temp = players[idx];
            players[idx] = players[idx - 1];
            players[idx - 1] = temp;
        }

        return players;
    }

    public static void main(String[] args) {
        String[] players = {"mumu", "soe", "poe", "kai", "mine"};
        String[] callings = {"soe", "kai"};

        String[] result = solution(players, callings);
        System.out.println(Arrays.toString(result));
    }
}