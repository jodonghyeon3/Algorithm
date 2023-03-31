class Solution {
    public int solution(int balls, int share) {
       return recursive(balls, share);
    }

    private static int recursive(int balls, int share) {
      if (balls == share || share == 0) {
            return 1;
        }
        return recursive((balls -1), (share - 1)) + recursive(balls - 1, share);
    }
}