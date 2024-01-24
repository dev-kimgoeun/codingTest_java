class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        int str = Integer.valueOf ((String.valueOf(a)+String.valueOf(b)));
        int cal = 2*a*b;
        answer = (str >= cal)? str : cal;
        return answer;
    }
}