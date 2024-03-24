import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] list = new int[9];
        int count = 0;
        int max =0;
        
        for(int i=0; i<list.length; i++){
            list[i]=sc.nextInt();
            if(list[i]>max){
                max = list[i];
                count = i+1;
            }
        }
        System.out.println(max);
        System.out.println(count);
    }
}