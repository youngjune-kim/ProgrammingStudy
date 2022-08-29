import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        for(int i = 0; i < input; i++){
            int floor = sc.nextInt();
            int address = sc.nextInt();

            System.out.println(Calculator(floor, address));
        }
    }

    public static int Calculator(int floor, int address) {
        int[][] map = new int[floor + 1][address];

        for (int i = 0; i < address; i++) {
            map[0][i] = i + 1;
        }
        for(int i = 1; i < floor + 1; i++){
            map[i][0] = 1;
            for(int j = 1; j < address; j++){
                map[i][j] = map[i][j - 1] + map[i - 1][j];
            }
        }

        int answer = map[floor][address - 1];

        return answer;
    }
}
