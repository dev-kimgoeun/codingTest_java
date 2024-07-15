import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int i=0; i<n/5; i++){
            System.out.print("V");
        }
        for(int j=0; j<n%5; j++){
            System.out.print("I");
        }
    }
}