import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        a = check(n,a);
        b = check(n,b);
        c = check(n,c);
        System.out.println(a+b+c);

    }
    static int check(int n, int k){
       int sum =0;
        if(n >= k){
            sum+=k;
        }else {
            sum +=n;
        }
        return sum;
    }
}