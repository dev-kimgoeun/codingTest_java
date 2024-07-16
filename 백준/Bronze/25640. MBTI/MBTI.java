import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String m = br.readLine();
        int n = Integer.parseInt(br.readLine());
        
        int cnt=0;
        for(int i=0; i<n; i++){
            String f = br.readLine();
            if(m.equals(f)){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}