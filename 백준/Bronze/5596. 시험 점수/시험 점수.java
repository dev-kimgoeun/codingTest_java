import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int s = 0;
        for(int i=0; i<4; i++){
             s+=sc.nextInt();
        }
        int t = 0;
        for(int i=0; i<4; i++){
           t +=sc.nextInt();
        }
        System.out.println(Math.max(s,t));
    }
}