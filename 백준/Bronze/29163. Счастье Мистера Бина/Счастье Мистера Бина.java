import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int cnt1 = 0;
        int cnt2 = 0;
        
        for(int i=0; i<n; i++){
            int q = sc.nextInt();
            if(q%2 == 0){
                cnt1++;
            }else{
                cnt2++;
            }
        }
        if(cnt1 > cnt2){
            System.out.println("Happy");
        }else{
            System.out.println("Sad");
        }
    }
}