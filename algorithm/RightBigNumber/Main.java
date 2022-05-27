import java.io.*;
import java.util.StringTokenizer;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        int[] nums = new int[0];
        int input = 0;
        try(BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            input = Integer.parseInt(bufferedReader.readLine());
            StringTokenizer st = new StringTokenizer(bufferedReader.readLine()," ");
            nums = new int[input];
            int index = 0;
            while (st.hasMoreTokens()){
                nums[index] = Integer.parseInt(st.nextToken());
                index++;
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        int Max = nums[0];
        for(int i = 0; i < input; i++){
            if(Max < nums[i]){
                Max = nums[i];
            }
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i = 0; i < input; i++){
            if(i == input - 1){
                bw.write("-1");
                bw.newLine();
                break;
            }
            if (nums[i] == Max){
                bw.write("-1");
                bw.newLine();
                continue;
            }
            for(int j = i + 1; j < input; j++) {
                if(nums[i] < nums[j]){
                    bw.write(String.valueOf(nums[j]));
                    bw.newLine();
                    break;
                }
            }
        }
        bw.close();
    }
}
