import java.util.*;

public class Main {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int answer = sc.nextInt();
        int[] arr = new int[input];
        List<Integer> list = new ArrayList<>();

        for(int i = 0; i < input; i++){
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        for(int i = 0; i < input - 2; i++){
            for(int j = i + 1; j < input - 1; j++) {
                for(int k = j + 1; k < input; k++){
                    if(arr[i] + arr[j] + arr[k] > answer){
                       k = input + 1;
                    }else {
                        list.add(answer - (arr[i] + arr[j] + arr[k]));
                    }
                }
            }
        }

        Collections.sort(list);
        System.out.println(answer - list.get(0));
    }
}
