import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class Main{
    public static void main(String[] args)  {

        Scanner sc = new Scanner(System.in);
        BigInteger n = sc.nextBigInteger();

        while (n.compareTo(BigInteger.valueOf(0)) !=0 ) {

            if(n.remainder(BigInteger.valueOf(42)).compareTo(BigInteger.valueOf(0)) == 0){
                System.out.println("PREMIADO");
            }else{
                System.out.println("TENTE NOVAMENTE");
            }
            n = sc.nextBigInteger();
        }
    }
}