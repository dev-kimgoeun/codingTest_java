import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i<n; i++) {
            
            int a = sc.nextInt();
            String v = sc.next();
            
            for (int j = 0; j <a; j++) {
                System.out.print(v);
            }
            System.out.println();
        }
    }
}