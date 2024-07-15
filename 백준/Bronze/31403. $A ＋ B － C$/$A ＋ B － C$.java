import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        String c = sc.nextLine();
        
        int n = Integer.parseInt(a);
        int m = Integer.parseInt(b);
        int k = Integer.parseInt(c);
        
        System.out.println(n+m-k);
        System.out.println(Integer.parseInt(a+b)-k);
    }
}