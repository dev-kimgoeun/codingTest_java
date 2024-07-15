import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int i = sc.nextInt();
        int a = sc.nextInt();
        int r = sc.nextInt();
        int c = sc.nextInt();

        int n1 = h*i;
        int n2 = a*r*c;
        System.out.println(n1-n2);

    }
}