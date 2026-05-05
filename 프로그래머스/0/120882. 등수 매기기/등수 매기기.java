import java.util.Arrays;

class Solution {
    public int[] solution(int[][] score) {
        //평균 점수
        double[] avg = new double[score.length];
        for(int i=0; i<score.length; i++){
            avg[i] = (score[i][0]+score[i][1])/2.0;
        }
        //순위 매기기(비교. 1위 내림차순)
        int[] answer = new int[avg.length];
        Arrays.fill(answer, 1); //새로운 지식
        for(int i=0; i<avg.length; i++){
            for(int j=0; j<avg.length;j++){
                if(avg[i]<avg[j]){
                    answer[i]++;
                }
            }
        }
        return answer;
    }
}