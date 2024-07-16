import java.util.*;

public class Main {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);

        int q = 9*1+7 * 3 + 8 * 1 + 0 * 3 + 9 * 1 + 2 * 3 + 1 * 1 + 4 * 3 + 1 * 1 + 8 * 3;
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        int s = a*1+b*3+c*1;

        System.out.println("The 1-3-sum is "+(q+s));
    }
}