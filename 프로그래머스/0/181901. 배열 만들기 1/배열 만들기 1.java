import java.util.*;

class Solution {
    public int[] solution(int n, int k) {
        int[] answer = new int[n/k];
        int num = 0;
        
        for(int i=k; i<=n; i+=k){
            
                answer[num++]=i;
            
        }
        return answer;
    }
}