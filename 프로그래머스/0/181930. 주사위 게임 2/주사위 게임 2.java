class Solution {
    public int solution(int a, int b, int c) {
        int answer = 0;
        
        for(int i=1; i<7; i++){
            if((a == b) &&(b == c) && (a== c)){
                answer = (a + b + c) * (a*a + b*b + c*c ) * (a*a*a + b*b*b + c*c*c );
            } else if((a != b) && (b!= c) && (a != c)){
                answer = a + b + c;
            } else {
                answer = (a + b + c) * (a*a + b*b + c*c );
            }
        }
            return answer;
    }
}