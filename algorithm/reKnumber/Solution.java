import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    public int[] solution(int[] array, int[][] commands){
        int[] answer = new int[commands.length];
        int[] start = new int[commands.length];
        int[] pick = new int[commands.length];
        int[] end = new int[commands.length];

        for(int i = 0; i < commands.length; i++){
            for(int j = 0; j < 3; j++) {
                if(j == 0){
                    start[i] = commands[i][j] - 1;
                }
                if(j == 1){
                    end[i] = commands[i][j];
                }
                if(j == 2){
                    pick[i] = commands[i][j] - 1;
                }
            }
        }

        for(int i = 0; i < start.length; i++){
            List<Integer> list = new ArrayList<>();
            for(int j = start[i]; j < end[i]; j++){
                list.add(array[j]);
            }
            Collections.sort(list);
            answer[i] = list.get(pick[i]);
        }
        return answer;
    }
}
