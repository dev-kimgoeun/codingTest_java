import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        int result = 1;
        
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) != sb.charAt(i)){
                result = 0;
            }
        }
        System.out.println(result);
    }
}