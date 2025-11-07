import java.util.*;

class Solution {
  // P17687 : [3차] n진수 게임
    public String solution(int n, int t, int m, int p) {
        String answer = "";
        // List<String> baseString = new ArrayList<>();
        
        int count = 0;
        int turnNumber = 1;
        
        int turn = m==p ? 0 : p;
        while(true){
            String[] baseStrings = Integer.toString(count, n).split("");
            for(String baseString : baseStrings){
                if(turnNumber%m == turn) {
                    answer+=baseString.toUpperCase();
                }
                if(answer.length() == t)
                    return answer;
                turnNumber++;
            }
            count++;
        }
    }
}
