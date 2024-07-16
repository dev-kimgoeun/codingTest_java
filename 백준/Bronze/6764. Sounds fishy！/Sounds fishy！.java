import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
       
        int[] arr = new int[4];
        
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        if(arr[0]< arr[1] && arr[1] <arr[2] && arr[2] < arr[3]){
            System.out.println("Fish Rising");
        }else if(arr[0]> arr[1] && arr[1] > arr[2] && arr[2] > arr[3]){
            System.out.println("Fish Diving");
        }else if(arr[0] == arr[1] && arr[1] == arr[2] && arr[2] == arr[3]){
            System.out.println("Fish At Constant Depth");
        }else{
            System.out.println("No Fish");
        }
    }
}