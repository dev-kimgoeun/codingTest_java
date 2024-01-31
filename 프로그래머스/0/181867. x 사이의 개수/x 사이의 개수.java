class Solution {
    public int[] solution(String myString) {
       String[] parts = myString.split("x", myString.length());
        int[] answer = new int[parts.length];
        
        for(int i=0; i<parts.length; i++){
            answer[i] = parts[i].length();
        }
        return answer;
    }
}