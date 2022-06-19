//import java.util.*;
//
//public class Main {
//
//    public static void main(String []args) {
//        Scanner sc = new Scanner(System.in);
//        int input = sc.nextInt();
//        int[][] arr = new int[][];
//        for (int i = 0; i < input; i++) {
//            arr[i][0] = sc.nextInt();
//            arr[i][1] = sc.nextInt();
//        }
//
//        Arrays.sort(arr, (e1, e2) -> {
//            if (e1[0] == e2[0]) {
//                return e1[1] - e1[1];
//            } else {
//                return e1[0] - e2[0];
//            }
//        });
//    }
//}
import java.util.*;

public class Main {
    public static class Point{
        public int x;
        public int y;

        public Point(int x, int y){
            this.x = x;
            this.y = y;
        }

        public int getX(int x){
            return this.x;
        }
        public int getY(int y){
            return this.y;
        }
    }

    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        List<Point> list = new ArrayList<>();
        for(int i = 0; i < input; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            list.add(new Point(x, y));
        }
        Collections.sort(list, (Point p1, Point p2) -> {
            if(p1.x == p2.x){
                return p1.y - p2.y;
            } else {
                return p1.x - p2.x;
            }
        });

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < list.size(); i++) {
            sb.append(list.get(i).getX(i) + " " + list.get(i).getY(i));
            sb.append('\n');
        }
        System.out.println(sb);
    }
}
