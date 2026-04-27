class Solution {
    public int solution(int[][] board) {
        //위치찾기위한 똑같은 크기 배열
        int[][] trap = new int[board.length][board[0].length];
        for(int i=0; i<board.length ; i++){
            for(int j=0;j<board[i].length; j++){ 
                if(board[i][j] == 1){ //지뢰 확인
                    trap[i][j] = 1; //복사본 표시
                    //위험지역 칸 표시. 겹칠 경우, 표시x + 영역 해당하는지 확인
                    //범위 [i-1][j-1~j+1], [i][j-1,j+1], [i+1][j-1~j+1]
                    //if -> board[i].length > i+1 | i-1 >= 0
                    //if -> board.length > j+1 | j-1 > 0
                    //이때 trap[][]에 표시
                    for(int ni=i-1; ni<=i+1; ni++){
                        for(int nj=j-1; nj<=j+1; nj++){
                            if((ni==i && nj==j)){continue;}
                            if(ni>=0 && nj>=0 && ni <board.length && nj <board[0].length){
                                trap[ni][nj] = 1;   
                            }
                        }
                    }
                }
            }
        }
        int count = 0;
        for(int i=0; i<trap.length; i++){
            for(int j=0; j<trap[i].length; j++){
                if(trap[i][j] == 0) count++;
            }
        }
        return count;
    }
}