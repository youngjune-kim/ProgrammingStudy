import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args){
        try(BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))){
            int input = Integer.parseInt(bufferedReader.readLine());
            Stack<Integer> stack = new Stack<>();
            List<Integer> list = new ArrayList<>();
            int answer = 0;

            for(int i = 0; i < input; i++){
                list.add(Integer.parseInt(bufferedReader.readLine()));
            }

            for(int i = 0; i < input; i++){
                if(list.get(0).equals(0)){
                    stack.pop();
                    list.remove(0);
                }else {
                    stack.add(list.remove(0));
                }
            }
            
            int size = stack.size();
            for(int i = 0; i < size; i++){
                answer += stack.pop();
            }

            System.out.println(answer);

        }catch (IOException e){
            e.printStackTrace();
            System.out.println("Failed to input keyboard");
        }
    }
}
