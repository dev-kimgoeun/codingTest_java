import java.util.*;

class Solution {
    public int solution(int n) {
        String num = String.valueOf(n);
        
        String[] arr = num.split("");
        int result = 0;
        
        for(int i=0; i<arr.length; i++){
            result += Integer.parseInt(arr[i]);
        }
        return result;
    }
}