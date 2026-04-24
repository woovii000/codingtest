class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        // -board[0]/2 <= x <= board[0]/2
        // -board[1]/2 <= y <= board[1]/2
        int i=0;
        int[] now = new int[2];
        while(i<keyinput.length){
            switch(keyinput[i]){
                case "right":
                    if(now[0]+1 > board[0]/2){
                        break;
                    } else{
                        now[0] +=1;    
                        break;
                    }
                case "left":
                    if(now[0]-1 < (-1)*board[0]/2){
                        break;
                    } else{
                        now[0] -=1;    
                        break;
                    }
                case "up":
                    if(now[1]+1 > board[1]/2){
                        break;
                    } else{
                        now[1] +=1;    
                        break;
                    }
                case "down":
                    if(now[1]-1 < (-1)*board[1]/2){
                        break;
                    } else{
                        now[1] -=1;    
                        break;
                    }
            }
            i++;
        }
        return now;
    }
}