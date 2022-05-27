import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] agrs) {
        int input = 0;
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            input = Integer.parseInt(bufferedReader.readLine());
            PriorityQueue<Integer> queue = new PriorityQueue<>();
            for(int i = 0; i < input; i++){
                int num = Integer.parseInt(bufferedReader.readLine());
                if(num == 0 && queue.size() == 0){
                    System.out.println(0);
                }else if(num > 0){
                    queue.add(num);
                }else if(num == 0) {
                    System.out.println(queue.remove());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
