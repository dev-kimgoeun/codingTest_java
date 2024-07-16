import java.util.*;

public class Main {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        if(str.contains("M") && str.contains("O")&& str.contains("B")&& str.contains("I")&& str.contains("S")) System.out.println("YES");
        else System.out.println("NO");
    }
}