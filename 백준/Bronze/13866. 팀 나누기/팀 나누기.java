import java.math.*;
import java.util.*;

public class Main{
    public static void main(String[] args)  {

        Scanner sc = new Scanner(System.in);
        int[] num = new int[4];
        
        for(int i=0; i<4; i++){
            num[i] = sc.nextInt();
        }
        Arrays.sort(num);

        System.out.println(Math.abs((num[0]+num[3]) - (num[1] + num[2])));
    }
}