import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String answer = "";
        
        for(int i =0; i<a.length(); i++){
            char cha = a.charAt(i);
                    
        if(Character.isUpperCase(cha)){
            answer += Character.toLowerCase(cha);
        }else{
            answer += Character.toUpperCase(cha);
        }
        }
                    System.out.println(answer);

    }
}