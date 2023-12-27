import java.math.BigInteger;
class Solution {
    public String solution(String a, String b) {
        String answer = "";
        
        BigInteger bigA = new BigInteger(a);
        BigInteger bigB = new BigInteger(b);
        BigInteger result = bigA.add(bigB);
        
        answer = String.valueOf(result);
        
        return answer;
    }
}