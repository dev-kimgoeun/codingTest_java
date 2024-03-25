import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] b = new int[n+1];
        for(int p=0; p<m; p++){
            int i = sc.nextInt();
            int j = sc.nextInt();
            int k = sc.nextInt();
            for(int idx = i; idx<=j; idx++){
                b[idx] = k;
            }
        }
        for(int i = 1; i<=n; i++){
            System.out.print(b[i]+" ");
        }
    }
}