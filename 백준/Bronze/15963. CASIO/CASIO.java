import java.util.*;
import java.io.*;
import java.math.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());
        
        if(a == b){
            System.out.println(1);
        }else{
            System.out.println(0);
        }
    }
}