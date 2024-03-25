import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0; i<t; i++){
            int h = sc.nextInt();
            int w = sc.nextInt();
            int n = sc.nextInt(); 
            
            int y = n%h;
            int x = n/h;
            
            if(y==0){
                if(x<10) System.out.println(h+"0"+x);
                else System.out.println(h+""+x);    
            }else{
                x++;
                if(x<10) System.out.println(y+"0"+x);
                else System.out.println(y+""+x);
                
            }
        }
    }
}