
import java.util.*;

public class Main{
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();

        if(a<0){
            a = Math.abs(a)*c;
            a = a+d; //60
            a = a+(b*e);
        }else{
            a= b-a;
            a= a*e;
        }
        System.out.println(a);
    }
}