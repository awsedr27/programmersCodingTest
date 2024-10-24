package programmersCodingTest;

import java.util.ArrayList;
import java.util.List;

//정수 n과 k가 주어졌을 때, 1 이상 n이하의 정수 중에서 k의 배수를 오름차순으로 저장한 배열을 return 하는 solution 함수를 완성해 주세요.
public class Basic52 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	//내풀이
    public int[] solution(int n, int k) {
        int[] answer = {};
        List<Integer> list=new ArrayList<Integer>();
        for(int i=1;i<=n;i++){
            if(i%k==0){
                list.add(i);
            }
        }
        
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
    //다른풀이
    public int[] solution2(int n, int k) {
        int count = n / k;


        int[] answer = new int[count];

        for (int i = 1; i <= count; i++) {
            answer[i - 1] = k * i;
        }

        return answer;
    }
}
