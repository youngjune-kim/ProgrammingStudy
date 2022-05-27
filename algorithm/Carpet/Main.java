public class Main {
    public static void main(String[] arge){
        int brown = 24;
        int yellow = 24;

        Solution solution = new Solution();
        int[] result = solution.solution(brown, yellow);

        System.out.println(String.format("[%d, %d]", result[0],result[1]));
    }
}
