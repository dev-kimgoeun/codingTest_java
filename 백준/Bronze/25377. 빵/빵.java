import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        
        for(int i=0; i<n; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            
            if(a<=b){
                sum += (b-a);
            }
        }
        if(sum == 0){
            System.out.println(-1);
        }else{
            System.out.println(sum);
        }
    }
}