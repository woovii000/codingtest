class Solution {
    public String[] solution(String[] quiz) {
        //String star = new String[quiz.length][];
        String[] answer = new String[quiz.length]; //답 저장
        for(int i=0; i<quiz.length; i++){
            String[] star = quiz[i].split(" ");
            //숫자 0,2,4 문자 1 3 
            char s = star[1].charAt(0); //연산자 추출
            switch(s){
                case '+':
                    if(Integer.parseInt(star[0])+ Integer.parseInt(star[2])== Integer.parseInt(star[4])){ //조건식 수정
                        answer[i] = "O";
                        break;
                    }else{
                        answer[i] = "X";
                        break;
                    }
                case '-':
                    if(Integer.parseInt(star[0]) - Integer.parseInt(star[2]) == Integer.parseInt(star[4])){
                        answer[i] = "O"; break;
                    }else{
                        answer[i] = "X"; break;
                    }
            }
        }
        return answer;
    }
}