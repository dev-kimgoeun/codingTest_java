class Solution {
    public String solution(String s, int n) {
        String answer = "";
        
        for(int i=0; i<s.length(); i++){
            char cn = s.charAt(i);
        
        
        if(cn == ' '){
            answer += cn;
            continue;
        }
        
        if(cn >= 'a' && cn<='z'){
            answer += (char)((cn-'a' +n) %26 +'a');
        }else{
            answer += (char)((cn -'A' +n) %26 + 'A');
            }
        }
        return answer;
    }
}