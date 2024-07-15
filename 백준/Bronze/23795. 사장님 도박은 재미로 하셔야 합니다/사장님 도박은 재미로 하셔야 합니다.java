import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long sum = 0;
        while(true){
           long n = Long.parseLong(br.readLine());
            if(n == -1){
                break;
            }
            sum +=n;
        }
        System.out.println(sum);
    }
}