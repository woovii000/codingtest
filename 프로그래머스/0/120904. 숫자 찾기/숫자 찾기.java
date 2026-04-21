class Solution {
    public int solution(int num, int k) {
        int idx = -1;
        String str = Integer.toString(num);
        //char ch = '7';
        //int num = Integer.parseInt(String.valueOf(ch));
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(k == Integer.parseInt(String.valueOf(ch))){
                idx = i+1;
                break;  
            } 
        }
        // int o=1;
        // int n = num;
        // int count = 1;
        // while(n){
        //     n = n/10 //자릿수 줄여가기
        //     n = n %10; //나머지 구하기 위함
        //     count++; //자릿수 확인
        // }
        // while(num!=0){            
        //     int mok = num/10;
        //     num = num%10; //나머지를 제외한 앞자리부터 끝-1자리까지 -> 오류
        //     if(mok == k){
        //         break;
        //     }
        //     o++;
        // }
        return idx;
    }
}