import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        
        for(int i=0; i<num; i++){
            String password = sc.next();
            if(6 <= password.length() && password.length() <= 9){
                System.out.println("yes");
            }else{
                System.out.println("no");
            }
        }
    }
}