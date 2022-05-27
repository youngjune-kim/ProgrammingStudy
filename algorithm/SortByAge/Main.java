import java.util.*;

public class Main {
    private static class Sort{
        private int age;
        private String name;

        public Sort(int age, String name){
            this.age = age;
            this.name = name;
        }

        public int getage() {
            return this.age;
        }

        public String getname() {
            return this.name;
        }
    }

    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();

        int input = sc.nextInt();
        List<Sort> list = new ArrayList<>();

        for(int i = 0; i < input; i++){
            int age = sc.nextInt();
            String name = sc.next();
            list.add(new Sort(age, name));
        }

        Collections.sort(list, Comparator.comparingInt((Sort p) -> p.age));

        for(int i = 0; i < input; i++) {
            sb.append(list.get(i).getage() + " " + list.get(i).getname());
            sb.append("\n");
        }

        System.out.println(sb);
    }

}
