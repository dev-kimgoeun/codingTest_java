class Solution {
    public int solution(int n, String control) {
        int answer = n;
                
        for(int i=0; i<control.length(); i++){
            if( control.charAt(i) == 'w' ){
                answer = answer + 1;
                //System.out.println("w : "+answer);
            }else if( control.charAt(i) == 's') {
                answer = answer - 1;
                //System.out.println("s : "+answer);
            }else if( control.charAt(i) == 'd' ) {
                answer = answer + 10;
                //System.out.println("d : "+answer);
            }else if( control.charAt(i) == 'a' ){
                answer = answer - 10;
                //System.out.println("a : "+answer);
            }else {
                return answer;
            }
        }
        
        return answer;
    }
}