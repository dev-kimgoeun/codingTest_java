import java.util.*;
class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        int min = 100;
        int[][] num = new int[array.length][2];
        
        Arrays.sort(array);
        
        for(int i=0; i<array.length; i++) {
            num[i][0] = array[i];
            num[i][1] = Math.abs(array[i]-n); 
        }
        
        for(int i=0; i<num.length; i++) {
            if(min > num[i][1]) {
                min = num[i][1];
                answer = num[i][0];
            }
        }        
        return answer;
    }
}