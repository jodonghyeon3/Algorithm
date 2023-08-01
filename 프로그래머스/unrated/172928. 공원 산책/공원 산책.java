class Solution {
    public static int[] solution(String[] park, String[] routes) {
        int x = -1;
        int y = -1;

        char[][] parkArr = new char[park.length][park[0].length()];

        for (int i = 0; i < park.length; i++) {
            parkArr[i] = park[i].toCharArray();

            if (park[i].contains("S")) {
                y = i;
                x = park[i].indexOf("S");
            }
        }

        for (int i = 0; i < routes.length; i++) {
            char direction = routes[i].charAt(0);
            int steps = Integer.parseInt(routes[i].substring(2));

            int xA = x;
            int yA = y;

            for (int j = 0; j < steps; j++) {
                switch (direction) {
                    case 'E':
                        xA++;
                        break;
                    case 'S':
                        yA++;
                        break;
                    case 'N':
                        yA--;
                        break;
                    case 'W':
                        xA--;
                        break;
                }

        
                if (xA < 0 || yA < 0 || yA >= parkArr.length || xA >= parkArr[0].length || parkArr[yA][xA] == 'X') {
                    break;
                }

            
                if (j == steps - 1) {
                    x = xA;
                    y = yA;
                }
            }
        }

        return new int[]{y, x};
    }
}
