import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static class Point{
        public int x;
        public int y;

        public Point(int x, int y){
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int testcase = sc.nextInt();

        for(int i = 0; i < testcase; i++){
            int size = sc.nextInt();
            int pick = sc.nextInt();
            int[] number = new int[size];
            List<Integer> list = new ArrayList<>();
            Queue<Point> queue = new LinkedList<>();

            for(int x = 0; x < size; x++){
                number[x] = sc.nextInt();

            }
            for(int j = 0; j < number.length; j++) {
                queue.add(new Point((number[j]), j));
                list.add(number[j]);
            }

            Collections.sort(list, Collections.reverseOrder());

            int count = 0;
            int answer = 1;
            while(!queue.isEmpty()){
                if(pick == queue.peek().y && list.get(count) == queue.peek().x){
                    break;
                }else if(list.get(count) == queue.peek().x){
                    answer++;
                    queue.poll();
                    list.remove(count);
                }else{
                    queue.add(queue.poll());
                }
            }
            sb.append(answer).append("\n");
        }
        System.out.println(sb);
    }
}
