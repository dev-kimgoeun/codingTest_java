class Solution {
    public int[] solution(int money) { 
      int[] answer = new int[2];
      int ice_ame = 5500;
        
        answer[0] = money / ice_ame;
        answer[1] = money % ice_ame;
        
        return answer;
    }
}