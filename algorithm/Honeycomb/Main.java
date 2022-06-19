import java.util.Scanner;

public class Main {
    public static void main(String []args){
        int count = 1;
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int six = 1;

        int i = 1;
        if (num == 1) {
        }else {
            while (num > six) {
                count++;
                six += 6 * i;
                i++;
            }
        }
        System.out.println(count);
    }
}
