import java.util.*;

class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        ArrayList<Integer> al = new ArrayList<>();
        
        while(n!=1) {
            for(int i=2; i<=n; i++){
                if(n%i==0){
                    n = n/i;
                    if(!al.contains(i)){
                        al.add(i);
                    }                    
                    break;
                }
            }
        }
        
        answer = al.stream().mapToInt(i->i).toArray();
        return answer;
    }
}