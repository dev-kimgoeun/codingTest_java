import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        if("M".equals(s)){
            System.out.println("MatKor");
        }else if("W".equals(s)){
            System.out.println("WiCys");
        }else if("C".equals(s)){
            System.out.println("CyKor");
        }else if("A".equals(s)){
            System.out.println("AlKor");
        }else if("$".equals(s)){
            System.out.println("$clear");
        }
    }
}