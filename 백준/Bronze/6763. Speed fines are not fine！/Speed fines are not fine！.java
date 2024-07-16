import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());

        if((m-n) <= 0 ){
            System.out.println("Congratulations, you are within the speed limit!");
        }else if(1 <= (m-n) && (m-n)<=20){
            System.out.println("You are speeding and your fine is $100.");
        }else if(21 <= (m-n) && (m-n)<=30){
            System.out.println("You are speeding and your fine is $270.");
        }else if(31 <= (m-n)){
            System.out.println("You are speeding and your fine is $500.");
        }
    }
}