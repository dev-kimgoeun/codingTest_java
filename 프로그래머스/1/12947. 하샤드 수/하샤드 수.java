class Solution {
    public boolean solution(int x) {
        int x1 = x;
        int sum = 0;
        
        while(x != 0){
            sum += x%10;
            x/=10;
        
        }
        return x1% sum == 0? true : false;
    }
}