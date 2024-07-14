import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        
        while(sc.hasNext()){
            int sum =0;
            int a = sc.nextInt();
            if(a == 0) break;
            
            for(int i=0; i<=a; i++){
                sum += i;
                
            }
            System.out.println(sum);
        }
    }
}