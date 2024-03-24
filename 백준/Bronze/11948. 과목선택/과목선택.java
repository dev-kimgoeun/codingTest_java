import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int out1 = Integer.MAX_VALUE;
        int out2 = Integer.MAX_VALUE;
        
        for(int i=0; i<4; i++){
            int temp = sc.nextInt();
            sum += temp;
            if(temp<out1)out1 = temp;
        }
        for(int i=0; i<2; i++){
            int temp = sc.nextInt();
            sum+= temp;
            if(temp < out2)out2 = temp;
        }
        System.out.println(sum-out1-out2);
    }
}