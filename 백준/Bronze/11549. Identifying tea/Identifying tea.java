import java.util.*;

public class Main {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int count =0;
        
        for(int i=0; i<5; i++){
            if(sc.nextInt() == n){
                count+=1;
            }
        }
        System.out.println(count);
    }
}