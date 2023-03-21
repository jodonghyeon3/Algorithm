import java.util.*;
class Solution {
    public int solution(int cacheSize, String[] cities) {
        final int CACHE_MISS = 5;
        final int CACHE_HIT = 1;
        
        int answer = 0;

        if (cacheSize == 0) {
            return CACHE_MISS * cities.length;
        }

        LinkedHashMap<String, Integer> cache = new LinkedHashMap<String, Integer>(cacheSize, 0.75f, true) {
            protected boolean removeEldestEntry(Map.Entry<String, Integer> eldest) {
                return size() > cacheSize;
            }
        };


        for (String city : cities) {
            String upperCity = city.toUpperCase();
            if (cache.containsKey(upperCity)) {
                answer += CACHE_HIT;
            } else {
                answer += CACHE_MISS;
            }
            cache.put(upperCity, 0);
        }

        return answer;
    }
}