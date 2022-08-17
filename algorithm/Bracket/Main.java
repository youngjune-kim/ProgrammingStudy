import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.*;

public class Main {
    public static void main(String[] args){
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            int input = Integer.parseInt(bufferedReader.readLine());

            for (int i = 0; i < input; i++) {
                String input2 = bufferedReader.readLine();
                char[] a = input2.toCharArray();
                List<Character> list = new ArrayList<>();
                List<Character> list2 = new ArrayList<>();
                int count = 0;

                for(int j = 0; j < a.length; j++) {
                    if (a[j] == '(') {
                        list.add(a[j]);
                        count++;
                    } else {
                        list2.add(a[j]);
                        count--;
                    }
                    if(count < 0) {
                        break;
                    }
                }
                if (list.size() == list2.size()) {
                    if(count < 0){
                        System.out.println("NO");
                    }
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }catch (IOException e){
            e.printStackTrace();
            System.out.println("Failed to input keyboard");
        }
    }
}
