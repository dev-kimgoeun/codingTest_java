import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[][]a = new int[10][10];
        int max = -1;
        int max_r = 0;
        int max_c = 0;
        for(int i=1; i<10; i++){
            for(int j=1; j<10; j++){
                int temp = sc.nextInt();
                if(temp>max){
                    max = temp;
                    max_r = i;
                    max_c = j;
                } 
            }
        }
        System.out.println(max);
        System.out.println(max_r+" " +max_c);
    }
}