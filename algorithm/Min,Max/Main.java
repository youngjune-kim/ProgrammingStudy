import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < input; i++){
            list.add(sc.nextInt());
        }
        System.out.print(Collections.min(list) + " " + Collections.max(list));
    }
}