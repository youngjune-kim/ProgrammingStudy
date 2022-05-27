import java.io.BufferedReader;
import java.io.IOError;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        List<String> list = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            int lenght = Integer.parseInt(bufferedReader.readLine());

            for (int i = 0; i < lenght; i++) {
                String[] str = bufferedReader.readLine().split(" ");

                if(str[0].equals("push")){
                    stack.add(Integer.valueOf(str[1]));
                }
                if (str[0].equals("top")){
                    if (stack.empty()) {
                        System.out.println("-1");
                    }else {
                        System.out.println(stack.peek());
                    }
                }
                if (str[0].equals("size")) {
                    System.out.println(stack.size());
                }
                if (str[0].equals("empty")) {
                    if (stack.empty()) {
                        System.out.println("1");
                    } else {
                        System.out.println("0");
                    }
                }
                if (str[0].equals("pop")) {
                    if (stack.empty()) {
                        System.out.println("-1");
                    } else {
                        System.out.println(stack.pop());
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Failed to input keyboard");
        }
    }
}