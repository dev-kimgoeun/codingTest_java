import java.util.*;
class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        int idx = 0;
        int[] array = {};
        int[] array_copy = {};

        while(true){
            idx = 0;
            array = Arrays.copyOf(arr, arr.length);
            for(int i : arr) {
                if(i%2==0 && i>=50) {
                    arr[idx++] = i/2;
                }
                else if(i%2!=0 && i<50) {
                    arr[idx++] = (i*2)+1;
                }
                else {
                    arr[idx++] = i;
                }
            }
            array_copy = Arrays.copyOf(arr, arr.length);
            if(Arrays.equals(array, array_copy)) {
                break;
            }        
            answer ++;
        }        
        return answer;
    }
}