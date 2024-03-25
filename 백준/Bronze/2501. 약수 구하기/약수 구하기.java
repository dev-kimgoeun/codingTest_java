import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int count =0;
        int result = 0;
        boolean find = false;
        for(int i=1; i<=n; i++){
            if(n%i == 0){
                count++;
            }
            if(k== count){
                find =true;
                result = i;
                break;
            }
        }
        if(find) System.out.println(result);
        else System.out.println(0);
    }
}