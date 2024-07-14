import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = a.toUpperCase();

        if(b.equals("N")){
            System.out.println("Naver D2");
        }else {
            System.out.println("Naver Whale");
        }
    }
}
