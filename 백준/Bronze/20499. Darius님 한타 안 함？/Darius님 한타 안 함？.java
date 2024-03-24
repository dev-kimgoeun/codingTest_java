import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
         String[] kda = sc.nextLine().split("/");
        int k = Integer.parseInt(kda[0]);
        int d = Integer.parseInt(kda[1]);
        int a = Integer.parseInt(kda[2]);
       if(k+a<d || d == 0){
           System.out.println("hasu");
       }else{
           System.out.println("gosu");
       }
    }
}