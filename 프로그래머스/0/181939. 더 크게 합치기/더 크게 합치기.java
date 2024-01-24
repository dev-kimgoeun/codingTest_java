class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        int p1 = Integer.valueOf((String.valueOf(a) + String.valueOf(b)));
        int p2 = Integer.valueOf((String.valueOf(b) + String.valueOf(a)));
        answer = (p1>p2)? p1 : p2;
        return answer;
    }
}