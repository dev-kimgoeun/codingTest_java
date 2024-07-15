import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double a  = sc.nextDouble();
        double b  = sc.nextDouble();
        double c  = sc.nextDouble();
        
        int m = (int)(a*b/c);
        int n = (int)(a/b*c);
        System.out.println(Math.max(m,n));
    }
}