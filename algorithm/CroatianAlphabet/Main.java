import java.util.Scanner;

public class Main {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        str = str.replaceAll("c=", "1");
        str = str.replaceAll("c-", "1");
        str = str.replaceAll("dz=", "1");
        str = str.replaceAll("d-", "1");
        str = str.replaceAll("lj", "1");
        str = str.replaceAll("nj", "1");
        str = str.replaceAll("s=", "1");
        str = str.replaceAll("z=", "1");

        System.out.println(str.length());
    }
}
