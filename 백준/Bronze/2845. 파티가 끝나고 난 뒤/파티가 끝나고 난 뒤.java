import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        for(int i = 0; i<5; i++){
            int temp = sc.nextInt();
            System.out.print(temp - (a*b)+" ");
        }
    }
}