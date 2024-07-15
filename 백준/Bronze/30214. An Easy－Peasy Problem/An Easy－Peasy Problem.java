import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        double m = sc.nextDouble();
        
        if(m/2 <= n){
            System.out.println("E");
        }else{
            System.out.println("H");
        }
    }
}