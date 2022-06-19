import java.util.Scanner;

public class Main {
    public static void main(String []args){
        StringBuilder sb = new StringBuilder();
        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt();
        int m = sc.nextInt();

        if(0 > m - 45){
           if (h > 0) {
               h--;
           }else {
               h = 23;
           }
            m = 60 + (m - 45);
        }else {
            m = m - 45;
        }
        sb.append(h);
        sb.append(" ");
        sb.append(m);

        System.out.println(sb);
    }
}
