import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int sum = 0;
        for(int i=0; i<num; i++){
            sum += sc.nextInt();
        }
        if(sum > 0){
            System.out.println("Right");
        }else if(sum < 0){
            System.out.println("Left");
        }else if(sum == 0){
            System.out.println("Stay");
        }
    }
}