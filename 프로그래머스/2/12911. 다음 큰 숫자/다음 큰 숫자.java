class Solution {
    public int solution(int n) {
        int answer = n;
        int first = Integer.bitCount(n);
        
        while(true){
            int next = Integer.bitCount(++answer);
            
            if(first == next) break;
        }
        return answer;
    }
}