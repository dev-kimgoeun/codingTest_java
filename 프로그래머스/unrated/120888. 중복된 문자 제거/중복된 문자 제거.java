import java.util.*;
class Solution {
    public String solution(String my_string) {
        String[] arr = my_string.split("");
        
        List<String> list = new ArrayList<String>();
        for(int i=0; i< arr.length; i++){
            if(list.contains(arr[i])){
                continue;
            }
            list.add(arr[i]);
        }
        StringBuilder br = new StringBuilder();
        for(String s: list){
            br.append(s);
        }
        return br.toString();
    }
}