import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int count = 1;
        String str;
        List<Integer> list = new ArrayList<>();

        while (count < num) {
            str = String.valueOf(num - count);
            int size = str.length();
            int sum = 0;
            for (int i = 0; i < size; i++) {
                sum += Integer.parseInt(String.valueOf(str.charAt(i)));
            }
            if (num == Integer.parseInt(str) + sum) {
                list.add(Integer.parseInt(str));
            }
            count++;
        }

        if(list.size() != 0) {
            System.out.println(Collections.min(list));
        }else {
            System.out.println(0);
        }
    }
}
