import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        int cnt =0;
        ArrayList<String> al = new ArrayList<>();
        
        for(int i=0; i<s.length(); i++){
            cnt = 0;
            for(int j=0; j<s.length(); j++){
                if(s.charAt(i) == s.charAt(j)){
                    cnt++;
                }
            }
            if(cnt == 1){
                al.add(String.valueOf(s.charAt(i)));
            }
        }
        
        Collections.sort(al);
        for(int i =0; i<al.size(); i++){
            answer += al.get(i);
        }
        
        return answer;
    }
}