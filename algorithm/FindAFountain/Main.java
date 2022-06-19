import java.util.Scanner;

public class Main {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        int num = 1;
        int count = 0;
        while(input > 0){
            input = input - num;
            num++;
            count++;
        }
        int x = 0;
        int y = 0;
        if(num % 2 == 0){
            x = 1 - input;
            y = count + input;
        }else{
            y = 1 - input;
            x = count + input;
        }
        sb.append(x + "/" + y);

        System.out.println(sb);
    }
}
