class Solution {
    public int solution(int[] arr) {
        int j = 0;
        while (true) {
            int[] arr1 = arr.clone();
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] >= 50 && arr[i] % 2 == 0) {
                    arr[i] /= 2;
                } else if (arr[i] < 50 && arr[i] % 2 == 1) {
                    arr[i] = arr[i] * 2 + 1;
                }
            }
            int cnt = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == arr1[i]) {
                    cnt++;
                }
            }
            if (cnt == arr.length) {
                break;
            }
            j++;
        }
        return j;
    }
}