import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] agrs){
        int input = 0;
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            input = Integer.parseInt(bufferedReader.readLine());
            PriorityQueue<Integer> heap = new PriorityQueue<>((o1, o2) -> o2 - o1);
            for(int i = 0; i < input; i++){
                int num = Integer.parseInt(bufferedReader.readLine());
                if (num == 0 && heap.isEmpty()) {
                    System.out.println(0);
                } else if (num == 0) {
                    System.out.println(heap.remove());
                } else {
                    heap.add(num);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
