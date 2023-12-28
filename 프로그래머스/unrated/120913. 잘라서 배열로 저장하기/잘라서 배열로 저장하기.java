class Solution {
    public String[] solution(String my_str, int n) {
        String[] answer = my_str.length()%n==0?new String[my_str.length()/n]:new String[my_str.length()/n+1];
        int idx = 0;

        for(int i=0; i<my_str.length(); i=i+n) {
            if(i+n > my_str.length()) {
                answer[idx++] = my_str.substring(i);
            }
            else{
                answer[idx++] = my_str.substring(i,i+n);
            }
        }        
        return answer;
    }
}
