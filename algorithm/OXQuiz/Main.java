import java.util.*;

public class Main {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        for(int i = 0; i < input; i++){
            String size = sc.next();
            String[] arr = new String[size.length()];
            int count = 0;
            int answer = 0;
            for(int j = 0; j < size.length(); j++) {
                arr[j] = String.valueOf(size.charAt(j));
            }

            for(int x = 0; x < arr.length; x++) {
                if (arr[x].equals("O")) {
                    count++;
                    answer += count;
                } else {
                    count = 0;
                }
            }
            System.out.println(answer);
        }
    }
}
