class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        String str = "";
        
        for(int n=i; n<=j; n++){
            str = String.valueOf(n);
            for(int s=0; s<str.length(); s++){
                if(k == str.charAt(s)-'0'){
                    answer++;
                }
            }
        }
        return answer;
    }
}