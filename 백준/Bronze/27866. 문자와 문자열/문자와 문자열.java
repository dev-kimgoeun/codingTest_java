import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        int idx = sc.nextInt();
        System.out.println(text.charAt(idx-1));
    }
}