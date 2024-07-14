import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);
     int count = 0;
     while(true){
       String s = sc.nextLine();
          if(s.charAt(0) == '0')
         break;
         count ++;

         }
        for (int i = 1; i <= count; i++) {
            System.out.println("Case "+i+": Sorting... done!");
        }
            }
        }