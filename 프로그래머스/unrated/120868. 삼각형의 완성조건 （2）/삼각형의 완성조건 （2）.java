class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int from = sides[0] > sides[1] ? sides[0] - sides[1] + 1 : sides[1] - sides[0] + 1;
        int to = sides[0]+sides[1] ;        
        answer = to-from;        
        return answer;
    }
}
