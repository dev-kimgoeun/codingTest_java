import java.util.*;
class Solution {
    public int solution(int[] numbers) {
        int leng = numbers.length;
        Arrays.sort(numbers);
        return Math.max(numbers[0] * numbers[1], numbers[leng-2] * numbers[leng-1]);
    }
}