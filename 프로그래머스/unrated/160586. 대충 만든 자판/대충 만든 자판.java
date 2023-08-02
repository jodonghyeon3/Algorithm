import java.util.*;

class Solution {
    public static List<Integer> solution(String[] keymap, String[] targets) {
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < keymap.length; i++) {
            for (int j = 0; j < keymap[i].length(); j++) {
                char key = keymap[i].charAt(j);
                map.putIfAbsent(key, Integer.MAX_VALUE);
                map.put(key, Math.min(map.get(key), j + 1));
            }
        }

        List<Integer> result = new ArrayList<>();

        for (String target : targets) {
            int totalDistance = 0;
            for (char c : target.toCharArray()) {
                if (map.containsKey(c)) {
                    totalDistance += map.get(c);
                } else {
                    totalDistance = 0;
                    break;
                }
            }
            result.add(totalDistance == 0 ? -1 : totalDistance);
        }

        return result;
    }

    public static void main(String[] args) {
        String[] keymap = {"AA"};
        String[] targets = {"B"};

        System.out.println(solution(keymap, targets));
    }
}
