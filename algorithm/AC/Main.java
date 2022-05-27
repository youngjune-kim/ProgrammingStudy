import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            int input = Integer.parseInt(bufferedReader.readLine());
            int sz = 0;
            StringBuilder sb = new StringBuilder("");
            for(int i = 0; i < input; i++) {
                boolean reverse = false;
                String move = bufferedReader.readLine();
                Deque<Integer> list = new LinkedList<>();
                int size = Integer.parseInt(bufferedReader.readLine());
                String str = bufferedReader.readLine().replace("[", "").replace("]", "").replace(",", " ");
                StringTokenizer st = new StringTokenizer(str);
                for (int index = 0; index < size; index++) {
                    list.add(Integer.valueOf(st.nextToken()));
                }
                sz = list.size();
                boolean isError = false;
                for (char c : move.toCharArray()) {

                    if (c == 'R') {
                        reverse = !reverse;
                    } else {
                        if (list.isEmpty()) {
                            isError = true;
                            break;
                        }
                        if (reverse) {
                            list.pollLast();
                            sz--;
                        } else {
                            list.pollFirst();
                        }
                    }
                }
                if (isError) {
                    sb.append("error\n");
                } else {
                    sb.append("[");
                    while (list.size() > 1) {
                        if (reverse) {
                            sb.append(list.pollLast());
                        } else {
                            sb.append(list.pollFirst());
                        }
                        sb.append(",");
                    }

                    if (list.size() == 0) {
                        sb.append("]\n");
                    } else {
                        sb.append(list.pollFirst()).append("]\n");
                    }
                }
            }
            System.out.print(sb);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
