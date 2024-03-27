import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int max = 0;
        int train = 0;
        for(int i=0; i<4; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            train = train -a+b;
            max = Math.max(train, max);
        }
        System.out.println(max);
    }
}