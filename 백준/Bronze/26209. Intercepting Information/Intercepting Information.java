import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String result = "S";
        
        for(int i=0; i<8; i++){
            int n = sc.nextInt();
            if(n>1){
                result = "F";
            }
        }
        System.out.println(result);
    }
}