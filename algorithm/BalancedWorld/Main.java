import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str;
        while(true) {
            str = in.nextLine();
            if (str.equals(".")) {
                break;
            }
            Calculator(str);
        }
    }
    public static void Calculator(String str){
        Stack<Integer> stack = new Stack<Integer>();
        String[] arr = new String[str.length()];

        for(int i = 0; i < str.length(); i++){
            arr[i] = String.valueOf(str.charAt(i));
        }
        for(int i = 0; i < arr.length; i++){
            if(arr[i].equals("(")){
                stack.add(1);
            }
            if(arr[i].equals("[")){
                stack.add(2);
            }
            if(arr[i].equals("]")){
                if(stack.size() == 0 || stack.pop() != 2){
                    System.out.println("no");
                    return;
                }
            }

            if(arr[i].equals(")")){
                if(stack.size() == 0 || stack.pop() != 1){
                    System.out.println("no");
                    return;
                }
            }
        }
        if(stack.size() == 0){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
        return;
    }
}