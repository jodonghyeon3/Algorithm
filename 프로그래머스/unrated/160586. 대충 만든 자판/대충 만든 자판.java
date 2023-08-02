import java.util.*;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
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
            int total = 0;
            for (char c : target.toCharArray()) {
                if (map.containsKey(c)) {
                    total += map.get(c);
                } else {
                    total = 0;
                    break;
                }
            }
            result.add(total == 0 ? -1 : total);
        }

        return result.stream().mapToInt(Integer::intValue).toArray();
    }

}
