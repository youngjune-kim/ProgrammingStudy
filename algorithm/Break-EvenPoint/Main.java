import java.util.Scanner;

public class Main {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int fixnum = sc.nextInt();
        int costnum = sc.nextInt();
        int salesnum = sc.nextInt();
        int answer = 0;

        if(costnum >= salesnum) {
            answer = -1;
        }else{
            answer = (fixnum / (salesnum - costnum))  + 1;
        }
        System.out.println(answer);
    }
}
