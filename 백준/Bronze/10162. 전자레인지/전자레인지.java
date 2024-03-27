import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
       int t = sc.nextInt();
        if(t%10 != 0) System.out.println(-1);
        else {
            int a = t/300;
            t = t%300;
            int b = t/60;
            t = t%60;
            int c = t/10;
            System.out.println(a+ " "+b+" "+c);
        }
    }
}