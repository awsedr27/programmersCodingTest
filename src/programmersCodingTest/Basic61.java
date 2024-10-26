package programmersCodingTest;

import java.util.Arrays;

public class Basic61 {
//정수 리스트 num_list와 정수 n이 주어질 때, n 번째 원소부터 마지막 원소까지의 모든 원소를 담은 리스트를 return하도록 solution 함수를 완성해주세요.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	//내풀이
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length-n+1];
        for(int i=n-1,j=0;i<num_list.length;i++){
            answer[j++]=num_list[i];
        }
        
        return answer;
    }
    //다른풀이
    public int[] solution2(int[] num_list, int n) {
        int[] a= Arrays.copyOfRange(num_list, n-1, num_list.length);
        return a;
    }
}
