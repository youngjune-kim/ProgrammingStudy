import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] start = new int[commands.length];
        int[] end = new int[commands.length];
        int[] cut = new int[commands.length];
        int[] answer = new int[commands.length];

        for(int i = 0; i < commands.length; i++){
            for(int j = 0; j < 3; j++){
                start[i] = commands[i][0] - 1;
                end[i] = commands[i][1];
                cut[i] = commands[i][2] - 1;
            }
        }

        for(int i = 0; i < commands.length; i++) {
            List<Integer> list = new ArrayList<>();
            for(int j = start[i], x = 0; j < end[i]; j++, x++){
                list.add(array[j]);
            }
            Collections.sort(list);
            answer[i] = list.get(cut[i]);
        }

        return answer;
    }
}
//import java.util.Arrays;
//
//class Solution {
//    public int[] solution(int[] array, int[][] commands) {
//        int answer[] = new int[commands.length];
//        int x = 0;
//
//        for(int i = 0; i < commands.length; i++) {
//        	int start = commands[i][0];
//        	int end = commands[i][1];
//        	int k = commands[i][2];
//
//        	int[] tmp = new int[end - start + 1];
//
//        	int a = 0;
//        	for(int j = start-1, a = 0; j < end; j++, a++) {
//        		tmp[a] += array[j];
//        		}
//        	Arrays.sort(tmp);
//        	answer[x++] = tmp[k-1];
//        }
//
//        return answer;
//    }
//}