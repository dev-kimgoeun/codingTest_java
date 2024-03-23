import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int d = sc.nextInt();
        int sum = 0;
        for(int i=0; i<5; i++){
            if(d == sc.nextInt()) sum++;
        }
        System.out.println(sum);
    }
}