import java.util.*;
import java.math.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        BigInteger a = sc.nextBigInteger();
        BigInteger b = sc.nextBigInteger();
        BigInteger c = new BigInteger("2");
        
        System.out.println(a.subtract(b).divide(c).add(b));
        System.out.println(a.subtract(b).divide(c));
    }
}