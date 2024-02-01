import java.util.*;

class Solution {
    public String[] solution(String my_string) {
        int leng = my_string.length();
        String[] answer = new String[leng];
        
        for (int i=0; i<leng; i++){
            answer[i] = my_string.substring(i);
        }
        Arrays.sort(answer);
        return answer;
    }
}