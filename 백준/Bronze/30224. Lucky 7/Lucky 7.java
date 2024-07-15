import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        if(contains(n)){
            if(n %7 == 0){
                System.out.println(3);
            }else{
                System.out.println(2);
            }
        }else {
            if(n%7 == 0){
                System.out.println(1);
            }else{
                System.out.println(0);
            }
        }


    }
    static boolean contains(int n){
        return Integer.toString(n).contains("7");
    }
}