public class Main {
    public static void main(String[] args) {
        int[] array = new int[]{1, 5, 2, 6, 3, 7, 4};
        int[][] commands = new int[][]{{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};

        Solution solution = new Solution();
        int[] result = solution.solution(array, commands);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}