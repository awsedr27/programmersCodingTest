package programmersCodingTest;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Introduction31 {
//외과의사 머쓱이는 응급실에 온 환자의 응급도를 기준으로 진료 순서를 정하려고 합니다. 정수 배열 emergency가 매개변수로 주어질 때 응급도가 높은 순서대로 진료 순서를 정한 배열을 return하도록 solution 함수를 완성해주세요.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	//내풀이
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        Map<Integer,Integer> map=new HashMap<Integer,Integer>();
        for(int i=0;i<emergency.length;i++){
            map.put(emergency[i],i);
        }
        Arrays.sort(emergency);
        for(int i=0;i<emergency.length;i++){
            answer[map.get(emergency[emergency.length-1-i])]=i+1;
        }
        return answer;
    }
    //다른풀이
    public int[] solution2(int[] emergency) {
        int[] answer = new int[emergency.length];

        for(int i = 0; i < answer.length; i++){
            if(answer[i] != 0){
                continue;
            }
            int idx = 1;
            for(int j = 0; j < answer.length; j++){
                if(emergency[i] < emergency[j]){
                    idx++;
                }
            }
            answer[i] = idx;
        }
        return answer;
    }
}
