import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[201];
        
        for(int i=0; i<n; i++){
            int temp = sc.nextInt();
            a[temp+100]++;
        }
        int v = sc.nextInt();
        System.out.println(a[v+100]);
    }
}