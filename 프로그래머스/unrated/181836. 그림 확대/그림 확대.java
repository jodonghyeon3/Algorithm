import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public String[] solution(String[] picture, int k) {
           int rows = picture.length;
        int cols = picture[0].length();

        int newRows = rows * k;
        int newCols = cols * k;

        String[] enlargedPicture = new String[newRows];
        for (int i = 0; i < newRows; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < newCols; j++) {
                int row = i / k;
                int col = j / k;
                sb.append(picture[row].charAt(col));
            }
            enlargedPicture[i] = sb.toString();
        }

        return enlargedPicture;
    }
}