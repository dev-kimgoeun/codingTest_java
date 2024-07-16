import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int[] arr = new int[4];
        for(int i=0; i<4; i++){
            arr[i] = sc.nextInt();
        }
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        boolean q = false;
        for(int i=0; i<4; i++){
            if(arr[i] == a){
                System.out.println(i+1);
                q= true;
            }
        }
        if(q == false){
            System.out.println(0);
        }
    }
}