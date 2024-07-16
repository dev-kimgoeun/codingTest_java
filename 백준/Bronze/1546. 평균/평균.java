import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double sum = 0;
        double [] arr = new double[n];

        for(int i=0; i<n; i++){
            arr[i] += sc.nextDouble();
        }
        Arrays.sort(arr);
        double l = arr[n-1];

        for(int i=0; i<arr.length; i++){
            sum += arr[i]/l*100;
        }
        System.out.println(sum/n);
    }
}