class Solution {
    public int solution(int order) {
        int answer = 0;
        
        for(char c: Integer.toString(order).toCharArray()){
            if(c !='0' && c%3 ==0){
                answer += 1;
            }
        }
        return answer;
    }
}