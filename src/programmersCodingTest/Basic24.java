package programmersCodingTest;

import java.util.Arrays;

public class Basic24 {
//정수가 담긴 리스트 num_list가 주어질 때, 모든 원소들의 곱이 모든 원소들의 합의 제곱보다 작으면 1을 크면 0을 return하도록 solution 함수를 완성해주세요.
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	//내풀이
    public int solution(int[] num_list) {
        int answer = 0;
        int mul=1;
        int sum=0;
        for(int i:num_list){
            mul*=i;
            sum+=i;
        }
        if(mul<Math.pow(sum,2)){
            answer=1;
        }else{
            answer=0;
        }
        return answer;
    }
    //다른풀이
    public int solution2(int[] num_list) {
        int sum = Arrays.stream(num_list).reduce(Integer::sum).getAsInt();
        int product = Arrays.stream(num_list).reduce((i,j)->i*j).getAsInt();
        return product < sum*sum ? 1 : 0;
    }

}
