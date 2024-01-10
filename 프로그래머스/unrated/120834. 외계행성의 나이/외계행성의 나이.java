class Solution {
    public String solution(int age) {
        String answer = "";
        String strAge = String.valueOf(age);
        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i<strAge.length(); i++) {
            sb.append((char)(strAge.charAt(i) + '1'));
        }
        answer = sb.toString();
        return answer;
    }
}