class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        String str =  pat.toLowerCase();
        
        answer = myString.toLowerCase().contains(str)? 1:0;
        return answer;
    }
}