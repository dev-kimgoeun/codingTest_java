import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[] list = new int[10];

        for (int i = 0; i < 10; i++) {
            list[i] = sc.nextInt();
        }
        int sum1 = list[0]*6 +list[1]*3 +list[2]*2 + list[3]*1 +list[4]*2;
        int sum2 = list[5]*6 +list[6]*3 +list[7]*2 + list[8]*1 +list[9]*2;
        System.out.println(sum1 + " " + sum2);
    }
}