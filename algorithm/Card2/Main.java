import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] arge){
        int n = 0;
        int answer = 0;
        Queue<Integer> queue = new LinkedList<>();

        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            String input = bufferedReader.readLine();
            n = Integer.parseInt(input);

            for(int i = 1; i < n + 1; i++){
                queue.add(i);
            }

            while(!queue.isEmpty()){
                for(int i = 0; i < 10; i++) {
                }
                if(queue.size() == 1){
                    answer = queue.peek();
                    break;
                }
                queue.poll();
                if(queue.size() == 1){
                    answer = queue.peek();
                    break;
                }
                queue.add(queue.poll());
            }

        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Failed to input keyboard");
        }
        System.out.println(answer);
    }
}
