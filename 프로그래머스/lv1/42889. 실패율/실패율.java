import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        Map<Integer, Double> failureRates = new HashMap<>();

        int totalPlayers = stages.length;
        int playersAtStage = 0;


        Map<Integer, Integer> playersAtEachStage = new HashMap<>();
        for (int i = 0; i < totalPlayers; i++) {
            int stage = stages[i];
            if (playersAtEachStage.containsKey(stage)) {
                playersAtEachStage.put(stage, playersAtEachStage.get(stage) + 1);
            } else {
                playersAtEachStage.put(stage, 1);
            }
        }


        for (int i = 1; i <= N; i++) {
            if (totalPlayers == 0) {
                failureRates.put(i, 0.0);
            } else {
                playersAtStage = playersAtEachStage.getOrDefault(i, 0);
                failureRates.put(i, (double) playersAtStage / totalPlayers);
                totalPlayers -= playersAtStage;
            }
        }

        // Sort stages in descending order of failure rates
        List<Integer> stageList = new ArrayList<>(failureRates.keySet());
        stageList.sort((a, b) -> {
            if (failureRates.get(b).equals(failureRates.get(a))) {
                return a - b;
            } else {
                return failureRates.get(b).compareTo(failureRates.get(a));
            }
        });


        for (int i = 0; i < N; i++) {
            answer[i] = stageList.get(i);
        }

        return answer;
    }
}
