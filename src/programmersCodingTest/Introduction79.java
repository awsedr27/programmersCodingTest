package programmersCodingTest;

import java.util.Arrays;

public class Introduction79 {
//정수 배열 numbers가 매개변수로 주어집니다. numbers의 원소 중 두 개를 곱해 만들 수 있는 최댓값을 return하도록 solution 함수를 완성해주세요.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	//내풀이
    public int solution(int[] numbers) {
        int answer = 0;
        Arrays.sort(numbers);
        answer=Math.max(numbers[0]*numbers[1],numbers[numbers.length-2]*numbers[numbers.length-1]);
        return answer;
    }
}
