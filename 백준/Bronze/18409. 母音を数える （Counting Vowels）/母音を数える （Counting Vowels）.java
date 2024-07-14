import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        String str = br.readLine();

        int count = 0;
        for (int i = 0; i < num; i++) {
            switch (str.charAt(i)){
                case 'a' : case 'i' : case 'u' : case 'e' : case 'o':
                    count++;
            }
        }
        System.out.println(count);
    }
}