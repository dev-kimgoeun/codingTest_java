class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = {0,0};
        
        int fl = brown + yellow;
        
        for(int i=3; i<= fl; i++){
            int sero = i;
            int garo = fl/sero;
            
            if (garo < 3) continue;
            
            if(garo >= sero){
                if((garo-2) * (sero-2) == yellow) {
                    answer[0] = garo;
                    answer[1] = sero;
                    break;
                }
                
            }
        }
        
        return answer;
    }
}