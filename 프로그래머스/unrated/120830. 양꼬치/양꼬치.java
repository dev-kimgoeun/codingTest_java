class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        int y = n/10;
        
        int sum = (n*12000) + ((k-y)*2000);
        return sum;
    }
}