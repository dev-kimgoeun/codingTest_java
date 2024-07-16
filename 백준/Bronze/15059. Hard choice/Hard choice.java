import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        int d = sc.nextInt();
        int e = sc.nextInt();
        int f = sc.nextInt();
        int sum =0;
        if(d-a>0){
            sum += (d-a);
        }
        if(e-b>0){
            sum+=(e-b);
        }
        if(f-c>0){
            sum+=(f-c);
        }
        System.out.println(sum);
    }
}