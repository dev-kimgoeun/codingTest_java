class Solution {
    public String solution(String my_string) {
       String[] arr = my_string.split("");
        String result = "";
        
        for(int i=0; i<arr.length; i++){
            if(!((arr[i].equals("a")) || (arr[i].equals("e")) || (arr[i].equals("i")) || (arr[i].equals("o")) || (arr[i].equals("u")))){
                result += arr[i];
            }
        }
        return result;
    }
}