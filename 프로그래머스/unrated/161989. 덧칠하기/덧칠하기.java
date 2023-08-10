public class Solution {
    public static int solution(int n, int m, int[] sections) {
        if (sections.length == 0) {
            return 0;
        }

        int paintings = 0;
        int prevSection = sections[0];

        for (int i = 1; i < sections.length; i++) {
            if (sections[i] - prevSection > m) {
                paintings++;
            }
            prevSection = sections[i];
        }

        return paintings;
    }
}
