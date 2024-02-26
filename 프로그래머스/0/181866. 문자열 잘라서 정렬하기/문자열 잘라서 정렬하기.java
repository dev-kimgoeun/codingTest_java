import java.util.*;

class Solution {
    public String[] solution(String myString) {
    String[] arr = myString.split("x");
    ArrayList <String> list = new ArrayList<>();
        
        for(String str : arr){
            if(! str.isEmpty()){
                list.add(str);
            }
        }
        String[] answer = list.toArray(new String[list.size()]);
        Arrays.sort(answer);
        
        return answer;
    }
}