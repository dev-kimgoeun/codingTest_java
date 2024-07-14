import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int sum1 = 0;
        for (int i = 1; i <=n; i++) {
            sum1 +=i;
        }
        int sum2 = 0;
        for (int i = 1; i <=n; i++) {
            sum2 += i*i*i;
        }
        System.out.println(sum1);
        System.out.println(sum1*sum1);
        System.out.println(sum2);
    }
}