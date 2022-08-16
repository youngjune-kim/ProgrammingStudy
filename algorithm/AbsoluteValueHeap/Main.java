import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String []args){
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            StringBuilder sb = new StringBuilder();
            int input = Integer.parseInt(bufferedReader.readLine());

            PriorityQueue<Integer> queue = new PriorityQueue<>();
            PriorityQueue<Integer> negativequeue = new PriorityQueue<>((o1, o2) -> o2 - o1);
            for (int i = 0; i < input; i++) {
                int num = Integer.parseInt(bufferedReader.readLine());
                if (num == 0 && queue.size() == 0) {
                    sb.append(0 + "\n");
                } else if (num == 0) {
                    if (negativequeue.size() != 0 && Math.abs(negativequeue.peek()) == queue.peek()) {
                        int answer = queue.poll();
                        negativequeue.poll();
                        sb.append(-answer + "\n");
                    } else {
                        sb.append(queue.poll() + "\n");
                    }
                } else {
                    if (num < 0) {
                        negativequeue.add(num);
                    }
                    queue.add(Math.abs(num));
                }
            }
            System.out.println(sb);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
