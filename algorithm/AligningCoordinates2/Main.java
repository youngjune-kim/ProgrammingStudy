import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String []args){
        StringBuilder sb = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int [][]arr = new int[input][2];

        for(int i = 0; i < input; i++) {
            arr[i][1] = sc.nextInt();
            arr[i][0] = sc.nextInt();
        }

        Arrays.sort(arr, (e1, e2) -> {
            if(e1[0] == e2[0]){
                return e1[1] - e2[1];
            }else{
                return e1[0] - e2[0];
            }
        });

        for(int i = 0; i < input; i++){
            sb.append(arr[i][1] + " ");
            sb.append(arr[i][0] + "\n");
        }

        System.out.println(sb);
    }
}
