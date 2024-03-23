import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int [] alpa = new int[26];
        char[] temp = sc.next().toCharArray();
        
        for(int i =0; i<temp.length; i++){
            alpa[temp[i]-97]++;
        }
        for(int i=0; i<alpa.length; i++){
            System.out.print(alpa[i]+" ");
        }
    }
}