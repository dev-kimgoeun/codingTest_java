import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int price = sc.nextInt();

        System.out.print((int)(price * 0.78)+" " +(int)(price-(price*0.2*0.22)));

    }
}