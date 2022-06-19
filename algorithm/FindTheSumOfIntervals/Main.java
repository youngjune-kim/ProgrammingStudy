import java.io.StringReader;
import java.util.*;

public class Main {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       int num = sc.nextInt();
       int count = sc.nextInt();
       int[] arr = new int[num + 1];

       int index = 0;
       arr[0] = 0;
       for(int i = 1; i < num + 1; i++){
           index += sc.nextInt();
           arr[i] = index;
       }

       for(int i = 0; i < count; i++){
           int start = sc.nextInt();
           int end = sc.nextInt();
           int answer = arr[end] - arr[start - 1];
           System.out.println(answer);
       }
    }
}