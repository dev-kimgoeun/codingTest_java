import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] list = new int[n];
        
        for(int i=0; i<n; i++){
            list[i] = sc.nextInt();    
        }
        Arrays.sort(list);
        System.out.println(list[0]+" "+list[n-1]);
    }
}