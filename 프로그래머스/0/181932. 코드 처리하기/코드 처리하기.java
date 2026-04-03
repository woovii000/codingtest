class Solution {
    public String solution(String code) {
        int mode = 0;
        String ret = "";
        for(int i = 0; i<code.length(); i++){
            if(code.charAt(i)!='1'){ //ret에 추가
                if(mode==1){
                    if(i%2==1)
                        ret += code.charAt(i);
                } else{
                    if(i%2==0)
                        ret += code.charAt(i);
                }
            } else { //mode 변경만
                mode = (mode == 1) ? 0 : 1;
            }
        }
        return ret.equals("") ? "EMPTY": ret;
    }
}