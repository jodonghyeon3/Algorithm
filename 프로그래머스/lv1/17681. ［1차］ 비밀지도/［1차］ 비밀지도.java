class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[][] nArr = new String[n][n];

        for (int i = 0; i < nArr.length; i++) {
            int cnt = Integer.toBinaryString(arr1[i]).length();
            StringBuilder sb = new StringBuilder();

            while(cnt != n) {
                    sb.append('0');
                    cnt++;
            }
            sb.append(Integer.toBinaryString(arr1[i]));

            int cnt1 = Integer.toBinaryString(arr2[i]).length();
            StringBuilder sb1 = new StringBuilder();

            while(cnt1 != n) {
                sb1.append('0');
                cnt1++;
            }
            sb1.append(Integer.toBinaryString(arr2[i]));

            for (int j = nArr[i].length -1 ; j >= 0; j--) {
                if(sb.charAt(j) == '1' || sb1.charAt(j) == '1') {
                    nArr[i][j] = "#";
                } else {
                    nArr[i][j] = " ";
                }
            }
        }
        String[] answer = new String[n];
        for (int i = 0; i < n; i++) {
            StringBuilder sb3 = new StringBuilder();
            for (int j = 0; j < n; j++) {
                sb3.append(nArr[i][j]);
            }
            answer[i] = sb3.toString();
        }
        return answer;
    }
}