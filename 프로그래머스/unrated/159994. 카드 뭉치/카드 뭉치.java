class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        if (cards1 == null || cards2 == null || goal == null) {
            return "No";
        }
        
        int goalIdx = 0;
        int cards1Idx = 0;
        int cards2Idx = 0;
        
        while (goalIdx < goal.length && (cards1Idx < cards1.length || cards2Idx < cards2.length)) {
            if (cards1Idx < cards1.length && cards1[cards1Idx].equals(goal[goalIdx])) {
                cards1Idx++;
                goalIdx++;
            } else if (cards2Idx < cards2.length && cards2[cards2Idx].equals(goal[goalIdx])) {
                cards2Idx++;
                goalIdx++;
            } else {
                return "No";
            }
        }
        
        if (goalIdx == goal.length) {
            return "Yes";
        } else {
            return "No";
        }
    }
}
