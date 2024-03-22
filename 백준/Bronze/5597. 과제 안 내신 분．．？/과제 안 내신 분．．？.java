import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a[]= new int[31];
        for(int i=0; i<28; i++){
            int num = sc.nextInt();
            a[num]++;
        }
        for(int i=1; i<31; i++){
            if(a[i] == 0) System.out.println(i);
        }
    }
}