class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length]; //{0, ... , 0} 초기화
        for(int i=0; i<emergency.length; i++){ //{1, ... ,1} 우선순위
            answer[i] += 1;
        }
        
        for(int i=0; i<emergency.length-1; i++){
            for(int j=i+1; j<emergency.length; j++){ //작은놈 후순위(숫자큼)
                if(emergency[i]>emergency[j]){answer[j] += 1;}
                else if (emergency[i]<emergency[j]){answer[i] += 1;}
            }
        }
        return answer;
    }
}