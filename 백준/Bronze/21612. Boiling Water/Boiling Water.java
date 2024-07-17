import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int m = 5*n-400;
        System.out.println(m);
        if(m>100){
            System.out.println(-1);
        }else if(m==100){
            System.out.println(0);
        }else{
            System.out.println(1);
        }
    }
}