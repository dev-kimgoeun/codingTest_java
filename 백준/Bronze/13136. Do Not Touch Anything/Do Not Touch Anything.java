import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long w = sc.nextLong();
        long h = sc.nextLong();
        long n = sc.nextLong();
        
        if(w%n > 0){
            w = w/n+1;
        }else{
            w = w/n;
        }

        if(h%n > 0){
            h = h/n+1;
        }else{
            h = h/n;
        }
        System.out.println(w*h);
    }
}