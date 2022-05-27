public class Main {
    public static void main(String[] arge){
        int[] priorities = new int[]{1, 1, 9, 1, 1, 1};
        int location = 0;

        Solution solution = new Solution();
        int result = solution.solution(priorities, location);
        System.out.println(result);
    }
}
