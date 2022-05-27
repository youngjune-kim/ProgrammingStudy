import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static class Point{

        private final int num;
        private final int count;
        public Point(int num, int count){
            this.num = num;
            this.count = count;
        }

        public int getNum() {
            return this.num;
        }
        public int getCount(){
            return this.count;
        }
    }

    public static void main(String[] args){
        int start = 0, end = 0;
        boolean [] visited = new boolean[100001];
        try(BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))){
            String input = bufferedReader.readLine();
            String[] arr = input.split(" ");
            start = Integer.parseInt(arr[0]);
            end = Integer.parseInt(arr[1]);

        }catch (IOException e) {
            e.printStackTrace();
        }
            Queue<Point> queue = new LinkedList<>();

            queue.add(new Point(start, 0));


            int answer = 0;
            while(!queue.isEmpty()){
                Point current = queue.poll();
                int x = current.getNum();
                int y = current.getCount();
                if(x == end){
                    answer = y;
                    break;
                }

                if(x + 1 <= 100000 && !visited[x + 1]){
                    visited[x + 1] = true;
                    queue.add(new Point(x + 1, y + 1));
                }

                if(0 <= x - 1  && !visited[x - 1]){
                    visited[x - 1] = true;
                    queue.add(new Point(x - 1, y+ 1));
                }

                if(x * 2 <= 100000 && !visited[x * 2]){
                    visited[x * 2] = true;
                    queue.add(new Point(x * 2, y+ 1));
                }
            }
            System.out.println(answer);


    }
}
