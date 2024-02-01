class Solution {
    public String solution(String my_string, int[] indices) {
        String answer = "";
        String [] list = my_string.split("");
        
        for(int i=0; i<indices.length; i++){
            list[indices[i]] = "";
        }
        for(String x : list) answer +=x;
        return answer;
    }
}