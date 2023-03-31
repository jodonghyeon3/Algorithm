class Solution {
    public String solution(String[] id_pw, String[][] db) {
        String answer = "";
        boolean found = false;
        
        for (int i = 0; i < db.length; i++) {
            if (id_pw[0].equals(db[i][0]) && id_pw[1].equals(db[i][1])) {
                found = true;
                answer = "login";
                break;
            } else if (id_pw[0].equals(db[i][0])) {
                found = true;
                answer = "wrong pw";
            }
    }
    
    if (!found) {
        answer = "fail";
    }
    
    return answer;
}

}