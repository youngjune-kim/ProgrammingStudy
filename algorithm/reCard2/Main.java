import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String args[]) {
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            String input = bufferedReader.readLine();
            int num = Integer.parseInt(input);
            Queue<Integer> queue = new LinkedList<>();

            for(int i = 0; i < num; i ++){
                queue.add(i + 1);
            }

            while(true){
                if(queue.size() == 1){
                    break;
                }
                queue.poll();
                queue.add(queue.poll());
            }
            System.out.println(queue.peek());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
