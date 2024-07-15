import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] t = new int[6];

        for (int i = 0; i < t.length; i++) {
            t[i] = sc.nextInt();
        }

        int m1 = t[0]*3 + t[1]*20 + t[2]*120;
        int m2 = t[3]*3 + t[4]*20 + t[5]*120;

        if(m1 > m2){
            System.out.println("Max");
        }else if(m1 == m2){
            System.out.println("Draw");
        }else{
            System.out.println("Mel");
        }
    }
}