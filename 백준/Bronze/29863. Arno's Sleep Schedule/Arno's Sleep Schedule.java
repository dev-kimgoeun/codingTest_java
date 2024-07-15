import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        if(20<= n && n <=23){
            System.out.println(24 - n+m);
        }else{
            System.out.println(m-n);
        }
    }
}