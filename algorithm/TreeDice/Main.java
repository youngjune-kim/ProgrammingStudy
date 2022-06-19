import java.util.Scanner;

public class Main {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[3];
        for(int i = 0; i < 3; i++) {
            arr[i] = sc.nextInt();
        }
        int answer = 0;

        int count = 0;
        int num = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1; j < arr.length; j++){
                if(arr[i] == arr[j]){
                    count++;
                    if(count == 1){
                        num = arr[i];
                    }
                }
            }
        }

        if(count >= 2){
            answer = 10000 + (num * 1000);
        }else if(count == 1){
            answer = 1000 + (num * 100);
        }else{
           answer = Math.max(arr[0], Math.max(arr[1], arr[2])) * 100;
        }

        System.out.println(answer);
    }
}
