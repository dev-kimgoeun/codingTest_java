import java.util.*;
import java.math.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        if(a==0 && b == 0){
            System.out.println("Not a moose");
         }else if(a == b){
            System.out.println("Even " + (a+b));
        }else {
            System.out.println("Odd " + (Math.max(a,b))*2);
        }
    }
}