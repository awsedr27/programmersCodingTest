package programmersCodingTest;

import java.util.Arrays;

public class Basic96 {
//정수 배열 arr이 매개변수로 주어집니다. arr의 길이가 2의 정수 거듭제곱이 되도록 arr 뒤에 정수 0을 추가하려고 합니다. arr에 최소한의 개수로 0을 추가한 배열을 return 하는 solution 함수를 작성해 주세요.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	//내풀이
    public int[] solution(int[] arr) {
        
        int k=0;
        while((int)Math.pow(2,k)<arr.length){
            k++;
        }
        int[] answer = new int[(int)Math.pow(2,k)];
        Arrays.fill(answer,0);
        for(int i=0;i<arr.length;i++){
            answer[i]=arr[i];
        }
        return answer;
    }
    
}
