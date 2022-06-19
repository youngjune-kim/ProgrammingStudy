import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String firstnum = String.valueOf(sc.nextInt());
        String secondnum = String.valueOf(sc.nextInt());

        char[] firstarr = new char[3];
        char[] secondarr = new char[3];
        for(int i = 2, j = 0; i >= 0; i--, j++) {
            firstarr[j] = firstnum.charAt(i);
            secondarr[j] = secondnum.charAt(i);
        }
        String answer1 = "";
        String answer2 = "";
        for(int i = 0; i < 3; i++){
            answer1 += firstarr[i];
            answer2 += secondarr[i];
        }

        if(Integer.parseInt(answer1) > Integer.parseInt(answer2)){
            System.out.println(answer1);
        }else{
            System.out.println(answer2);
        }
    }
}
