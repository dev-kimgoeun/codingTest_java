import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println(br.readLine().indexOf("555") == 0? "YES" : "NO");
        
    }
}