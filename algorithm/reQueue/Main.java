import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {
    public static void main(String args[]){
        String input = "";
        Queue<String> queue = new LinkedList<>();
        Queue<Integer> queue2 = new LinkedList<>();
        Queue<Integer> queue3 = new LinkedList<>();
        try(BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
        int cnt = Integer.parseInt(bufferedReader.readLine());

        for(int i = 0; i < cnt; i++){
            input = bufferedReader.readLine();
            String[] split = input.split(" ");
            queue.add(split[0]);
            if(split[0].equals("push")) {
                queue2.add(Integer.parseInt(split[1]));
            }
        }
        List<Integer> list = new ArrayList<>();
        int num = 0;
        while(!queue.isEmpty()){
            String q = queue.poll();
            if(q.equals("push")) {
                num = queue2.peek();
                queue3.add(queue2.poll());
            }
            if(q.equals("front")) {
                if(queue3.isEmpty()) {
                    list.add(-1);
                }else if(!queue3.isEmpty()) {
                    list.add(queue3.peek());
                }
            }if(q.equals("back")) {
                if(queue3.isEmpty()) {
                    num = -1;
                    list.add(num);
                }else if(!queue3.isEmpty()){
                    list.add(num);
                }
            }if(q.equals("size")) {
                list.add(queue3.size());
            }
            if(q.equals("empty")) {
                if(queue3.isEmpty()) {
                    list.add(1);
                }else if(!queue3.isEmpty()){
                    list.add(0);
                }
            }if(q.equals("pop")) {
                if(queue3.isEmpty()){
                    list.add(-1);
                }else if(!queue3.isEmpty()){
                    list.add(queue3.poll());
                }
            }
        }
        int size = list.size();
        for(int i = 0; i < size; i++) {
            System.out.println(list.get(i));
        }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
