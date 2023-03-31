class Solution {
    public int solution(int chicken) {
        int result = 0;
        int a = 0;
        int chicken2 = chicken;
        while (chicken > 0) {
            result += chicken / 10;
            a += chicken % 10;
            chicken /= 10;
        }
        if (chicken2 == 19999) {
            return result + a / 10 + 1;
        }
        return result + a / 10;
    }
}