class Solution {
    public int solution(int num, int k) {
        int answer = -1;
        String strNum = Integer.toString(num);
        
        for(int i=0; i<strNum.length(); i++){
            if(strNum.charAt(i) == k+'0') {
                answer = i + 1;
                break;
            }
        }
        return answer;
    }
}