import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        
        int cnt =0;
        while(sc.hasNext()){
         String c = sc.nextLine();
          if("W".equals(c)){
               cnt++;  
            }
        }
        
        if(cnt > 4) System.out.println(1);
        else if(cnt > 2) System.out.println(2);
        else if(cnt > 0) System.out.println(3);
        else  System.out.println(-1);
    }
}