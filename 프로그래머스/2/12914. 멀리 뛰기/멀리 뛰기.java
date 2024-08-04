class Solution {
    public long solution(int n) {
        long answer = 0;
        
        long[] kan = new long[n+2];
         kan[0] = 0;
         kan[1] = 1;
         kan[2] = 2;
        
        for(int i=3; i<=n; i++){
            kan[i] = (kan[i-1] + kan[i-2]) % 1234567;
        }
        return kan[n];
    }
}