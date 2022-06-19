import java.awt.*;
import java.util.*;
import java.util.List;

public class Main {

    public static class Point {
        private final String x;
        private final int y;

        public Point(String x, int y) {
            this.x = x;
            this.y = y;
        }

        public String getX() {
            return this.x;
        }

        public int getY() {
            return this.y;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine().toUpperCase();
        String answer = "";
        List<String> list = new ArrayList<>();
        if(word.length() != 1) {
            for (int i = 0; i < word.length(); i++) {
                list.add(String.valueOf(word.charAt(i)));
            }
            Set<String> set = new HashSet<String>(list);
            List<String> newList = new ArrayList<String>(set);

            List<Point> points = new ArrayList<>();

            for (int i = 0; i < newList.size(); i++) {
                points.add(new Point(newList.get(i), 0));
            }

            for (int i = 0; i < newList.size(); i++) {
                int count = 0;
                for (int j = 0; j < list.size(); j++) {
                    if (points.get(i).getX().equals(list.get(j))) {
                        count++;
                        points.set(i, new Point(points.get(i).getX(), count));
                    }
                }
            }
            Collections.sort(points, (Point p1, Point p2) -> p2.y > p1.y ? 1 : -1);

            if (points.get(0).getY() == points.get(1).getY()) {
                answer = "?";
            } else {
                answer = points.get(0).getX();
            }

            System.out.println(answer);
        }else{
            System.out.println(word);
        }
    }

}





