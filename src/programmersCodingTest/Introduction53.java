package programmersCodingTest;

import java.util.Arrays;

public class Introduction53 {
//정수 배열 array와 정수 n이 매개변수로 주어질 때, array에 들어있는 정수 중 n과 가장 가까운 수를 return 하도록 solution 함수를 완성해주세요.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	//내풀이
    public int solution(int[] array, int n) {
        Arrays.sort(array);
        int answer=array[0];
        int min=Math.abs(n-array[0]);
        for(int i=0;i<array.length;i++){
            if(min>Math.abs(n-array[i])){
                min=Math.abs(n-array[i]);
                answer=array[i];
            }
        }
        return answer;
    }
}
