class Solution {
    public String solution(String s) {
        String answer = "";
        
        String[] arr = s.split("");
        int count =0;
        
        for(String news : arr){
            count = news.contains(" ")? 0: count+1;
            answer += count%2 == 0? news.toLowerCase(): news.toUpperCase();
        }
        return answer;
    }
}