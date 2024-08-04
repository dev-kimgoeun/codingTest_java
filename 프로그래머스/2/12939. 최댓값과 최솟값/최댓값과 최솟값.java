import java.math.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        String[] nums = s.split(" ");
        
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        
        for(int i=0; i< nums.length; i++){
           int num = Integer.parseInt(nums[i]);
            
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        answer = min + " " + max;
        return answer;
    }
}