import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
        
        
        for(int l=0; l<n; l++){
            int a = sc.nextInt();
            String b = sc.next();
            
            for(int i=0; i<b.length(); i++){
                for(int k=0; k<a; k++){
                     System.out.print(b.charAt(i));
                }
            }
            System.out.println();
        }
    }
}