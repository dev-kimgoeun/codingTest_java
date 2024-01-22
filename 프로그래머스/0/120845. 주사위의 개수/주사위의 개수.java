class Solution {
    public int solution(int[] box, int n) {
        int answer = 1;
        
        for(int i:box){
            answer = answer *(i/n);
        }
        return answer;
    }
}