import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        br.close();
        System.out.print(factorial(a));
    }
    
    static long factorial(int a){
        if(a <= 0){
            return 1;
        }
        return a * factorial(a-1);
    }
}