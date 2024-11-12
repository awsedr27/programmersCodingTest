package programmersCodingTest;

import java.util.Arrays;

public class Introduction16 {
//정수 배열 numbers가 매개변수로 주어집니다. numbers의 원소의 평균값을 return하도록 solution 함수를 완성해주세요.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	//내풀이
    public double solution(int[] numbers) {
    	int answer=0;
    	for(int i:numbers) {
    		answer+=i;
    	}
        return answer/(double)numbers.length;
    }
}
