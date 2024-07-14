import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        if("NLCS".equals(str)){
            System.out.println("North London Collegiate School");
        }else if("BHA".equals(str)){
            System.out.println("Branksome Hall Asia");
        }else if("KIS".equals(str)){
            System.out.println("Korea International School");
        }else if("SJA".equals(str)){
            System.out.println("St. Johnsbury Academy");
        }        
    }
}