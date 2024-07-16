import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        int num = a*1+b*2+c*3;
        if(num >= 10){
            System.out.println("happy");
        }else{
            System.out.println("sad");
        }
    }
}