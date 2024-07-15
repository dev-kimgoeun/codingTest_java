import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        
        int sum = 0;
        for(int i=0; i<str.length(); i++){
            switch(str.charAt(i)){
                case 'a': case 'i' : case 'u' : case 'e' : case 'o': sum++;
            }
        }
        System.out.println(sum);
    }
}