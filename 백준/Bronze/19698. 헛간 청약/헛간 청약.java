import java.util.*;
import java.math.*;


public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        int l = sc.nextInt();
        int c = ((m / l) * (k/l));
        System.out.println(Math.min(n,c));

    }
}