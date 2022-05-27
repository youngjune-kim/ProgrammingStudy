import java.util.*;

public class Solution {
    private class Point{
        public int x;
        public int y;

        public Point(int x,int  y){
            this.x = x;
            this.y = y;
        }
    }

    public int solution(int[] priorities, int location) {
        Queue<Point> queue = new LinkedList<>();
        int answer = 0;
        int x = 0;
        int[] topnumber = new int[priorities.length];
        List<Integer> sortlist = new ArrayList<>();

        for (int i = 0; i < priorities.length; i++) {
            queue.add(new Point(priorities[i], i));

            sortlist.add(priorities[i]);
        }

        Collections.sort(sortlist);
        Collections.reverse(sortlist);

        for (int i = 0; i < priorities.length; i++) {
            topnumber[i] = sortlist.remove(0);
        }

        int count = 0;

        boolean a = true;
        while (a) {
            Point point = queue.peek();
            if (point.x == topnumber[x]) {
                if (point.y == location) {
                    count++;
                    answer = count;
                    a = false;
                }
                queue.remove();
                count++;
                x++;
            }else if(point.x != topnumber[x]) {
                queue.add(queue.remove());
            }
        }
        return answer;
    }
}


















