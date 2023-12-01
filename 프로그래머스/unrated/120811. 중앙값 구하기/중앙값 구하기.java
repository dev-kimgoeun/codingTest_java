class Solution {
    public int solution(int[] array) {
        int answer = 0;
        
        for(int i = 0; i<array.length; i++){
            for(int j = i; j < array.length; j++){
                if(array[j] < array[i]){
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        answer = array[array.length / 2];
        
        return answer;
    }
}