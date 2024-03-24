import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<3; i++){
            int h1 = sc.nextInt();
            int m1 = sc.nextInt();
            int s1 = sc.nextInt();
            int h2 = sc.nextInt();
            int m2 = sc.nextInt();
            int s2 = sc.nextInt();
        
            if(s1>s2){
                s2+=60;
                m2--;
            }
            s2 -=s1;
            
           if(m1>m2){
                m2+=60;
                h2--;
            }
            m2 -=m1;
            h2-=h1;
            
            System.out.println(h2+" "+m2+" "+s2);
        }
    }
}