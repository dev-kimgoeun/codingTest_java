import java.util.*;
import java.math.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        n/=2;
        System.out.println(Math.min(n,m));
    }
}