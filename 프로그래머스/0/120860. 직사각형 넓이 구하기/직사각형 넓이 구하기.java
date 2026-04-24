class Solution {
    public int solution(int[][] dots) {
        //변 = 축과 평행* (가로) * (세로)
        int ga=dots[0][0];
        int se=dots[0][1];
        for(int i=1; i<dots.length; i++){
            if(dots[i][0]!=ga){
                ga -= dots[i][0]; 
                break;
            }
        }
        for(int i=1; i<dots.length; i++){
            if(dots[i][1]!=se){
                se -= dots[i][1];  
                break;
            }  
        }
        int answer = ga*se; //넓이
        //음수 -> 양수
        return answer>0 ? answer: answer*(-1);
    }
}