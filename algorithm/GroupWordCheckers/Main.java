import java.util.*;

public class Main {
    static int Count = 0;
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        for(int i = 0; i < input; i++){
            String str = sc.next();
            if(str.length() == 1) {
                Count++;
            }else{
                Calculator(str);
            }
        }
        System.out.println(Count);
    }
    public static void Calculator(String str){
        String[] arr = new String[str.length()];
        List<String> list = new ArrayList<>();
        for(int i = 0; i < str.length(); i++) {
            arr[i] = String.valueOf(str.charAt(i));
        }
        for(int i = 0; i < arr.length; i++) {
            if (i + 1 < arr.length) {
                if (!arr[i].equals(arr[i + 1])) {
                    list.add(arr[i]);
                }
            } else {
                if (!arr[i].equals(arr[i - 1])) {
                    list.add(arr[i]);
                }else{
                    int size = list.size();
                    for(int j = 0; j < size; j++) {
                        if(list.get(j).equals(arr[i])){
                            list.add(arr[i]);
                        }
                    }
                }
            }
        }
        Set<String> numSet = new HashSet<>(list);
        if(numSet.size() == list.size()) {
            Count++;
        }
    }
}
