public class Main {
    public static void main(String args[]){
        String[] participant = new String[]{"leo", "kiki", "eden"};
        String[] completion = new String[]{"eden", "kiki"};

        Solution solution = new Solution();
        String result  = solution.solution(participant, completion);

        System.out.println(result);
    }
}
