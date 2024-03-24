import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String t = sc.next();
        int c =0;
        for(int i=0; i<n; i++){
             c += t.charAt(i)-'0';
        }
        System.out.println(c);
    }
}