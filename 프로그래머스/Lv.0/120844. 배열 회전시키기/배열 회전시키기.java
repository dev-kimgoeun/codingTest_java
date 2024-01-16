class Solution {
    public int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];
        
        for(int i=0; i<numbers.length; i++) {
            if(direction.equals("right")) {
                if(i== numbers.length-1) {
                    answer[0] = numbers[i];
                }
                else {
                    answer[i+1] = numbers[i];
                }
            }
            else {
                if(i== numbers.length-1) {
                    answer[i] = numbers[0];
                }
                else {
                    answer[i] = numbers[i+1];
                }
            }
        }
        return answer;
    }
}