import java.util.Scanner;

public class Main {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int up = sc.nextInt();
        int down = sc.nextInt();
        int top = sc.nextInt();
        int count = (top - down) / (up - down);


        if((top - down) % (up - down) != 0){
            count = 1;
        }

        System.out.println(count);
    }
}
