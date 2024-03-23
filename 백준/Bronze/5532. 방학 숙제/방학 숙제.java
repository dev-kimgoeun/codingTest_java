import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int ad = a/c;
        if(a%c !=0) ad++;
        int bd = b/d;
        if(b%d !=0)bd++;
        System.out.println(l-Math.max(ad,bd));
    }
}