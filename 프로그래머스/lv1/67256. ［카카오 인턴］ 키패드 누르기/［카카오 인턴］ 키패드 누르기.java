class Solution {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        int left = 10;
        int right = 12;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 1 || numbers[i] == 4 || numbers[i] == 7) {
                sb.append("L");
                left = numbers[i];
            } else if (numbers[i] == 3 || numbers[i] == 6 || numbers[i] == 9) {
                sb.append("R");
                right = numbers[i];
            } else {
                int distanceToLeft = distance(left, numbers[i]);
                int distanceToRight = distance(right, numbers[i]);

                if (distanceToLeft < distanceToRight ||
                        (distanceToLeft == distanceToRight && hand.equals("left"))) {
                    sb.append("L");
                    left = numbers[i];
                } else {
                    sb.append("R");
                    right = numbers[i];
                }
            }
        }
        
        
        return sb.toString();
    }

    public static int distance(int hand, int target) {
        int[][] keypad = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {10, 0, 12}
        };
        int targetX = 0, targetY = 0, handX = 0, handY = 0;


        for (int i = 0; i < keypad.length; i++) {
            for (int j = 0; j < keypad[i].length; j++) {
                if (keypad[i][j] == target) {
                    targetX = i;
                    targetY = j;
                }
                if (keypad[i][j] == hand) {
                    handX = i;
                    handY = j;
                }
            }
        }
        return Math.abs(handX - targetX) + Math.abs(handY - targetY);
    }
}