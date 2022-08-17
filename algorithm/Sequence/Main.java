import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String []args){
        int answer = 0;
        List<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int add = sc.nextInt();
        int []arr = new int[input];
        for(int i = 0; i < input; i++){
            arr[i] = sc.nextInt();
        }

        int count = input - add + 1;
        int secondcount = add;
        for(int i = 0; i < count; i++){
            int addnum = arr[i];
            for(int j = i + 1; j < secondcount; j++) {
                 addnum += arr[j];
            }
            secondcount++;
            list.add(addnum);
        }
        Collections.sort(list, Collections.reverseOrder());
        answer = list.get(0);
 
        System.out.println(answer);
    }
}
