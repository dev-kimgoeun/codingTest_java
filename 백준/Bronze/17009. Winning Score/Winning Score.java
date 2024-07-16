import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int sum1 = 0;
        int sum2= 0;

        int[] num = new int[6];
        for (int i = 0; i < 6; i++) {
            num[i] = sc.nextInt();
        }
        sum1 = num[0]*3 +num[1]*2 +num[2]*1;
        sum2 = num[3]*3 +num[4]*2 +num[5]*1;
        
        if(sum1 > sum2){
            System.out.println("A");
        }else if(sum1 < sum2){
            System.out.println("B");
        }else{
            System.out.println("T");
        }

    }
}