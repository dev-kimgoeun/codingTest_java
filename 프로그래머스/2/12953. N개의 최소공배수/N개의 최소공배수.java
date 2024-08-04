class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        
        if(arr.length == 1) return arr[0];
        
        int num = cal(arr[0], arr[1]);
        answer = (arr[0] * arr[1]) / num;
        
        if( arr.length >2 ){
            for(int i=2; i<arr.length; i++){
                int num2 = cal(answer, arr[i]);
                answer = (answer * arr[i]) /num2;
            }
        }
        return answer;
    }
    
    static int cal(int a, int b){
        int su = a%b;
        if(su == 0) return b;
        else return cal(b, su);
    }
}