class Solution {
    public String solution(String my_string, int s, int e) {
        String new_string = my_string.substring(s, e+1);
        
        StringBuffer sb = new StringBuffer(new_string);
        String newst = sb.reverse().toString();
        
        my_string = my_string.replaceAll(new_string, newst);
        return my_string;
    }
}