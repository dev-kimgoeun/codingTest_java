class Solution {
    public int solution(String my_string) {
        String[] str = my_string.split(" ");
        int answer = Integer.valueOf(str[0]);
        
        for(int i=0; i<str.length; i++) {
            if(str[i].equals("+")) {
                answer = answer + Integer.valueOf(str[i+1]);
            }
            else if(str[i].equals("-")) {
                answer = answer - Integer.valueOf(str[i+1]);
            }
        }        
        return answer;
    }
}
