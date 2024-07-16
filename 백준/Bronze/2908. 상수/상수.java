import java.util.*;
import java.math.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        n = Integer.parseInt(new StringBuilder().append(n).reverse().toString());
        m = Integer.parseInt(new StringBuilder().append(m).reverse().toString());
        
        
       System.out.println(Math.max(n,m));
    }
}