import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(true){
            String text = sc.nextLine();
            if(text.equals("#")) break;
            char[] textarr = text.toCharArray();
            int count = 0;
            for(int i=0; i<textarr.length; i++){
                if(textarr[i] =='a'||textarr[i] =='i'||textarr[i] =='u'||textarr[i] =='e'||textarr[i] =='o'||
                  textarr[i] =='A'||textarr[i] =='I'||textarr[i] =='U'||textarr[i] =='E'||textarr[i] =='O'){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}