class Solution {
    public String solution(String s) {
        String answer = "";
        int leng = s.length();
        
        for(int i=0; i<leng; i++){
            if(leng %2 == 0){
                answer = s.substring(leng/2-1,leng/2+1);
            }else {
                answer = s.substring(leng/2, leng/2+1);
            }
        }
        return answer;
    }
}