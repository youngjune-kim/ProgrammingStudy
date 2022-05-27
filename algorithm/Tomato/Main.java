import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    private static final int NON_BLOCK = 0;
    private static final int ALREADY_BEEN = 1;

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

        public int getDepth() {
            return this.depth;
        }
    }

    public static void main(String[] args) {
        int answer = 0;
        int[][] tomato = new int[][]{};
        int width = 0, height = 0;
        int count = 0; // 익은 토마토 개수
        int target = 0; // 목표 개수
        Queue<Point> queue = new LinkedList<>();

        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {

            String input = bufferedReader.readLine();
            String[] tomatoSize = input.split(" ");
            width = Integer.parseInt(tomatoSize[0]);
            height = Integer.parseInt(tomatoSize[1]);
            tomato = new int[height][width];
            target = width * height;

            for (int i = 0; i < height; i++) {
                String row = bufferedReader.readLine();
                //String[] splitedRow = row.split(" "); // "0 -1 0 0 0 0" -> ["0", "-1", .. . ]
                for (int j = 0, rowIndex = 0; j < width; j++, rowIndex += 2) {
                    if (row.charAt(rowIndex) == '-') {
                        rowIndex++;
                        tomato[i][j] = -(row.charAt(rowIndex) - '0');
                    } else {
                        tomato[i][j] = row.charAt(rowIndex) - '0';
                    }

                    if (tomato[i][j] == 1) {
                        queue.add(new Point(i, j, 0));
                    }

                    if (tomato[i][j] == -1) {
                        target--;
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Failed to input keyboard");
        }

        count = queue.size();

        while (!queue.isEmpty()) {
            Point currentPoint = queue.poll();
            int x = currentPoint.getX();
            int y = currentPoint.getY();
            int depth = currentPoint.getDepth();

            answer = depth;

            // 위
            if (0 < x && tomato[x - 1][y] == NON_BLOCK) {
                tomato[x - 1][y] = ALREADY_BEEN;
                queue.add(new Point(x - 1, y, depth + 1));
                count++;
            }

            // 왼쪽
            if (0 < y && tomato[x][y - 1] == NON_BLOCK) {
                tomato[x][y - 1] = ALREADY_BEEN;
                queue.add(new Point(x, y - 1, depth + 1));
                count++;
            }

            //오른쪽
            if (y + 1 < width && tomato[x][y + 1] == NON_BLOCK) {
                tomato[x][y + 1] = ALREADY_BEEN;
                queue.add(new Point(x, y + 1, depth + 1));
                count++;
            }

            //아래
            if (x + 1 < height && tomato[x + 1][y] == NON_BLOCK) {
                tomato[x + 1][y] = ALREADY_BEEN;
                queue.add(new Point(x + 1, y, depth + 1));
                count++;
            }
        }

        if (count == target) {
            System.out.println(answer);
        } else {
            System.out.println(-1);
        }
    }
}
