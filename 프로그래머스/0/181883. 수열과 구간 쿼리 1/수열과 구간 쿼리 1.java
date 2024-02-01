class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        
        for(int[] query : queries){
            int num1 = query[0];
            int num2 = query[1];
            
            for(int i=num1; i<=num2; i++){
                arr[i] += 1;
              }
        }
        return arr;
    }
}