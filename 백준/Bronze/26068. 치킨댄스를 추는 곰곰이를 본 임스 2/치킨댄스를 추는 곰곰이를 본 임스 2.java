import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        int cnt = 0;
        for(int i=0; i<n; i++){
            String s = br.readLine();
            s = s.replace("D-","");
            
            if(Integer.parseInt(s) <= 90){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}