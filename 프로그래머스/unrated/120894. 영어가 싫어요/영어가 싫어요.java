import java.util.*;

class Solution {
    public long solution(String numbers) {
        long answer = 0;
        String[] arr_str = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        
        for(int i=0; i<arr_str.length; i++) {
            numbers = numbers.replace(arr_str[i], String.valueOf(i));        
        }
        answer = Long.parseLong(numbers);
        return answer;
    }
}
