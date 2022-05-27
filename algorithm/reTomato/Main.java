import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static int NOTBLOCK = 0;
    public static int BLOCK = 1;
    public static class Point{
        public int x;
        public int y;
        public int a;

        public Point(int x, int y, int a){
            this.x = x;
            this.y = y;
            this.a = a;
        }
        public int getX(){
            return this.x;
        }
        public int getY(){
            return this.y;
        }
        public int getA(){
            return this.a;
        }
    }

    public static void main(String[] args){
        Queue<Point> queue = new LinkedList<>();
        int answer = 0;
        int total = 0;
        int width = 0;
        int height = 0;
        int[][] tomato = new int[][]{};
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            String input = bufferedReader.readLine();
            String[] arr = input.split(" ");
            width = Integer.parseInt(arr[0]);
            height = Integer.parseInt(arr[1]);
            tomato = new int[height][width];
            total = width * height;
            for(int i = 0; i < height; i ++){
                String row = bufferedReader.readLine();
                String[] rowsplit = row.split(" ");
                int[] nums = Arrays.stream(rowsplit).mapToInt(Integer::parseInt).toArray();
                for(int j = 0; j < nums.length; j++) {
                    tomato[i][j] = nums[j];
                    if(nums[j] == 1){
                        queue.add(new Point(i, j, 0));
                    }
                    if(nums[j] == -1) {
                        total--;
                    }
                }
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        int count = queue.size();
        while(!queue.isEmpty()){
            Point current = queue.poll();
            int x = current.getX();
            int y = current.getY();
            int a = current.getA();
            answer = a;

            //위
            if(x - 1 >= 0 && tomato[x - 1][y] == NOTBLOCK){
                tomato[x - 1][y] = BLOCK;
                queue.add(new Point(x - 1, y, a + 1));
                count++;
            }
            //아래
            if(x + 1 < height && tomato[x + 1][y] == NOTBLOCK){
                tomato[x + 1][y] = BLOCK;
                queue.add(new Point(x + 1, y, a + 1));
                count++;
            }
            //왼쪽
            if(y - 1 >= 0 && tomato[x][y - 1] == NOTBLOCK){
                tomato[x][y - 1] = BLOCK;
                queue.add(new Point(x, y - 1, a + 1));
                count++;
            }
            //오른쪽
            if(y + 1 < width && tomato[x][y + 1] == NOTBLOCK){
                tomato[x][y + 1] = BLOCK;
                queue.add(new Point(x, y + 1, a + 1));
                count++;
            }
        }
        if(count == total){
            System.out.println(answer);
        }else {
            System.out.println("-1");
        }
    }
}
