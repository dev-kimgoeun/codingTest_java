import java.util.*;

public class Main {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < 5; i++) {
            int num  = sc.nextInt();
            if(set.contains(num)) set.remove(num);
            else set.add(num);
        }

        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}