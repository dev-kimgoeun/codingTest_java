import java.util.*;

class Solution {
    public int solution(String number) {
        int answer = 0;
        int sum = 0;
        
        String [] list = number.split("");
        for(int i= 0; i< list.length; i++){
            sum += Integer.parseInt(list[i]);
        }
            answer = sum%9;
        return answer;
    }
}