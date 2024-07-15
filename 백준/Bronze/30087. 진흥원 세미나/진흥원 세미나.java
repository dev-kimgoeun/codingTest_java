import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i <=n; i++) {
            String sub = sc.nextLine();
            if(sub.equals("Algorithm")){
                System.out.println(204);
            }else if(sub.equals("DataAnalysis")){
                System.out.println(207);
            }else if(sub.equals("ArtificialIntelligence")){
                System.out.println(302);
            }else if(sub.equals("CyberSecurity")){
                System.out.println("B101");
            }else if(sub.equals("Network")){
                System.out.println(303);
            }else if(sub.equals("Startup")){
                System.out.println(501);
            }else if(sub.equals("TestStrategy")){
                System.out.println(105);
            }
        }
    }
}