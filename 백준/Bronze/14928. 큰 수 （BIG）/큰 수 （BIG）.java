import java.util.*;
import java.io.*;
import java.math.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String n  = br.readLine();
        
        long k = 0;
        for(int i=0; i<n.length(); i++){
            k = (k *10 +(n.charAt(i) - '0')) % 20000303;
        }
        System.out.println(k);
    }
}