import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int answer = 0;
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        
        for(int i = 0; i < input.length(); i++){
            String str = String.valueOf(input.charAt(i));
            if(str.equals("A") || str.equals("B") || str.equals("C")){
                answer += 3;
            }else if(str.equals("D") || str.equals("E") || str.equals("F")){
                answer += 4;
            }else if(str.equals("G") || str.equals("H") || str.equals("I")){
                answer += 5;
            }else if(str.equals("J") || str.equals("K") || str.equals("L")){
                answer += 6;
            }else if(str.equals("N") || str.equals("M") || str.equals("O")){
                answer += 7;
            }else if(str.equals("P") || str.equals("Q") || str.equals("R")|| str.equals("S")){
                answer += 8;
            }else if(str.equals("T") || str.equals("U") || str.equals("V")){
                answer += 9;
            }else{
                answer += 10;
            }
        }
        System.out.println(answer);
    }
}
