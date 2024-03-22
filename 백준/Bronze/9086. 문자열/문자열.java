import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        for(int i=0; i<t; i++){
            String text = sc.nextLine();
            String answer = text.substring(0,1)+text.substring(text.length()-1);
            System.out.println(answer);
        }
    }
}