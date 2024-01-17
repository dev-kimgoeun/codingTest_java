class Solution{
    public String solution(String my_string){
        String answer = "";
        StringBuilder sb = new StringBuilder();
        
        for(char c : my_string.toCharArray()){
            if(Character.isLowerCase(c)){
                sb.append(String.valueOf(c).toUpperCase());
            }else{
            sb.append(String.valueOf(c).toLowerCase());
        }
    } 
         answer = sb.toString();
        return answer;
    }
}