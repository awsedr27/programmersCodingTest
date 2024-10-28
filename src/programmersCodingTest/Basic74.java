package programmersCodingTest;

import java.util.Arrays;

//정수가 담긴 리스트 num_list가 주어질 때, 리스트의 길이가 11 이상이면 리스트에 있는 모든 원소의 합을 10 이하이면 모든 원소의 곱을 return하도록 solution 함수를 완성해주세요.

public class Basic74 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	//내풀이
    public int solution(int[] num_list) {
        int answer = 0;
        if(num_list.length>=11){
        	answer=Arrays.stream(num_list).reduce(Integer::sum).getAsInt();
        }else if(num_list.length<=10){
        	answer=Arrays.stream(num_list).reduce((i,j)->i*j).getAsInt();
        }
        return answer;
    }
}
