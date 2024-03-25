import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int i=0; i<n; i++){
            for(int j=0; j<2*n-1-i; j++){
                if(i<=j)System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
       for(int i=1; i<n; i++){
            for(int j=0; j<n+i; j++){
                if(i+j>=n-1)System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
}