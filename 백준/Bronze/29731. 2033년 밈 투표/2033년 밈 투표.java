import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String[] strings = {"Never gonna give you up", "Never gonna let you down", "Never gonna run around and desert you","Never gonna make you cry", "Never gonna say goodbye", "Never gonna tell a lie and hurt you", "Never gonna stop"};

        String[] str = new String[n+1];
        String result = "Yes";

        for (int i = 0; i < str.length; i++) {
            str[i] =  sc.nextLine();
        }

        for(int i =1; i<str.length; i++){
            result = "Yes";
            for (int j = 0; j < strings.length; j++) {
                if(str[i].equals(strings[j]) == true){
                    result = "No";
                    break;
                }
            }
            if("Yes".equals(result)){
                break;
            }

        }
        System.out.println(result);
    }
}