import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String args[]) {
        double average = 0;
        String nextinput = "";
        int count = 0;
        double num = 0;
        double total = 0;
        double answer = 0;
        List<Double> list = new ArrayList<>();

        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            String input = bufferedReader.readLine();
            for(int i = 0; i < Integer.parseInt(input); i++){
                nextinput = bufferedReader.readLine();
                String[] arr = nextinput.split(" ");
                num = Integer.parseInt(arr[0]);
                for(int j = 1; j < num + 1; j++){
                    total += Integer.parseInt(arr[j]);
                }
                average = Math.round((total / num) * 1000) / 1000.0;
                total = 0;
                for(int x = 1; x < num + 1; x++){
                    if(Integer.parseInt(arr[x]) > average){
                        count++;
                    }
                }
                answer = 100 / num;
                list.add(Math.round((answer * count) * 1000) / 1000.0);
                count = 0;
            }

            for(int i = 0; i < list.size(); i++){
                System.out.println(String.format("%.3f%%", list.get(i)));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
