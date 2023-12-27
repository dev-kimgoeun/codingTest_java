class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        
        for(char c : my_string.toCharArray()) {
            if((int)c >=65 && (int)c <=90) {
                answer[(int)c - 65]++;
            }
            if((int)c >=97 && (int)c <=122) {
                answer[(int)c - 71]++;                
            }
        }
        return answer;
    }
}

