import java.util.*;

class Solution
{
    public int solution(String s)
    {
        int answer = 0;

        Stack<Character> stack = new Stack<>();

        for(int i=0; i< s.length(); i++){
            if(stack.isEmpty()){
                stack.push(s.charAt(i));
            }else {
                char c = s.charAt(i);
                if(stack.peek() == c){
                    stack.pop();
                }else {
                    stack.push(c);
                }
            }
        }
        return stack.isEmpty() ? 1:0;
        }
    }
