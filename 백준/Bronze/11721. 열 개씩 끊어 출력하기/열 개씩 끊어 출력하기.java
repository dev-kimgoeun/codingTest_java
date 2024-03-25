import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String t = sc.nextLine();
        
        for(int i=0; i<t.length(); i=i+10){
            String temp;
            if(i+10<t.length()){
               temp = t.substring(i,i+10);
            }else {
                temp = t.substring(i);
            }
            System.out.println(temp);
        }
    }
}