import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    private static final int NON_BLOCK = 1;
    private static final int ALREADY_BEEN = 2;

    private static class Point {
        private final int x;
        private final int y;
        private final int depth;

        public Point(int x, int y, int depth) {
            this.x = x;
            this.y = y;
            this.depth = depth;
        }

        public int getX() {
            return this.x;
        }

        public int getY() {
            return this.y;
        }
    }

    public static void main(String[] args) {
        int answer = 0;
        int[][] maze = new int[][]{};
        int width = 0, height = 0;

        // input
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            // maze size
            String input = bufferedReader.readLine();
            String[] mazeSize = input.split(" ");
            height = Integer.parseInt(mazeSize[0]);
            width = Integer.parseInt(mazeSize[1]);
            maze = new int[height][width];

            // maze datas
            for (int i = 0; i < height; i++) {
                String row = bufferedReader.readLine();
                for (int j = 0; j < width; j++) {
                    maze[i][j] = row.charAt(j) - '0';
                }
            }
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("Failed to input keyboard");
            }

        // calculate
        Queue<Point> queue = new LinkedList<>();
        queue.add(new Point(0, 0, 1));
        maze[0][0] = ALREADY_BEEN;
        while (!queue.isEmpty()) {
            Point currentPoint = queue.poll();
            int x = currentPoint.getX();
            int y = currentPoint.getY();
            int depth = currentPoint.depth;

            if (x == width - 1 && y == height - 1) {
                answer = depth;
                break;
            }

            // 4-way checking
            if (x < width - 1 && maze[y][x + 1] == NON_BLOCK) {
                maze[y][x + 1] = ALREADY_BEEN;
                queue.add(new Point(x + 1, y, depth + 1));
            }
            if (0 < y && maze[y - 1][x] == NON_BLOCK) {
                maze[y - 1][x] = ALREADY_BEEN;
                queue.add(new Point(x, y - 1, depth + 1));
            }
            if (0 < x && maze[y][x - 1] == NON_BLOCK) {
                maze[y][x - 1] = ALREADY_BEEN;
                queue.add(new Point(x - 1, y, depth + 1));
            }
            if (y < height - 1 && maze[y + 1][x] == NON_BLOCK) {
                maze[y + 1][x] = ALREADY_BEEN;
                queue.add(new Point(x, y + 1, depth + 1));
            }
        }

        // output
        System.out.println(answer);
    }
}


