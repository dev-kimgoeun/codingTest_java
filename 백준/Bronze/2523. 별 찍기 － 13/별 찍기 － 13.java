import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int i=1; i<=2*n-1; i++){
            for(int j=0; j<n; j++){
                if(i<=n&&j<i || i>n&&j+i<2*n)System.out.print("*");
                else break;
            }
            System.out.println();
        }
    }
}