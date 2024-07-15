import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count=0;

        while (sc.hasNext()){
            String line = sc.nextLine();

            if(line == null){
                break;
            }
            count++;
        }
        System.out.println(count);
    }
}
