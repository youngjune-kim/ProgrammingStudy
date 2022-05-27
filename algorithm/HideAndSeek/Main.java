import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

    private static class Point {
        private final int x;
        private final int depth;

        public Point(int x, int depth) {
            this.x = x;
            this.depth = depth;
        }

        public int getX() {
            return this.x;
        }

        public int getDepth(){
            return this.depth;
        }
    }

    public static void main(String[] args) {
        int answer = 0;
        int start = 0, end = 0;
        boolean[] visited = new boolean[100001];

        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            String input = bufferedReader.readLine();
            String[] change = input.split(" ");
            start = Integer.parseInt(change[0]);
            end = Integer.parseInt(change[1]);

        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Failed to input keyboard");
        }

        Queue<Point> queue = new LinkedList<>();
        queue.add(new Point(start, 0));

        while (!queue.isEmpty()) {
            Point currentPoint = queue.poll();
            int x = currentPoint.getX();
            int depth = currentPoint.getDepth();

            if (x == end) {
                answer = depth;
                break;
            }

            if (0 <= x + 1 && x + 1 <= 100000 && !visited[x + 1]) {
                visited[x + 1] = true;
                queue.add(new Point(x + 1, depth + 1));
            }
            if (0 <= x - 1 && x - 1 <= 100000 && !visited[x - 1]) {
                visited[x - 1] = true;
                queue.add(new Point(x - 1, depth + 1));
            }
            if (0 <= x * 2 && x * 2 <= 100000 && !visited[x * 2]) {
                visited[x * 2] = true;
                queue.add(new Point(x * 2, depth + 1));
            }
        }

        System.out.println(answer);
    }
}
