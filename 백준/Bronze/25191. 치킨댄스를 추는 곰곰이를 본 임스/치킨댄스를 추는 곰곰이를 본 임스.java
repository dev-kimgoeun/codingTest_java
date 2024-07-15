import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int b = sc.nextInt();
        int s = sc.nextInt();
        
        if(n >= (b/2+s)){
            System.out.println((b/2+s));
        }else{
            System.out.println(n);
        }
    }
}