import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        for (int i = 0; i < 10; i++) {
            int n = sc.nextInt();
             sum +=n;
        }
		if(sum % 4 == 0) {
			System.out.println("N");
		}else if(sum % 4 == 1) {
			System.out.println("E");
		}else if(sum % 4 == 2) {
			System.out.println("S");
		}else if(sum % 4 == 3) {
			System.out.println("W");
		}
    }
}