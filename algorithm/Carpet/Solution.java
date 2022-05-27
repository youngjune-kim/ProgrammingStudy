public class Solution {
    public int[] solution(int brown, int yellow) {
        int num = brown + yellow;
        int sqrtNum = (int)Math.sqrt(num);
        int[] answer = new int[2];

        for (int height = 3; height <= sqrtNum; height++) {
            if(num % height != 0){
                continue;
            }

            int width = num / height;

            int yw = width - 2;
            int yh = height - 2;

            if(yw * yh == yellow){
              answer[0] = width;
              answer[1] = height;
            }
        }

        return answer;
    }
}
