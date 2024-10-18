package programmersCodingTest;

public class Basic25 {
//정수가 담긴 리스트 num_list가 주어집니다. num_list의 홀수만 순서대로 이어 붙인 수와 짝수만 순서대로 이어 붙인 수의 합을 return하도록 solution 함수를 완성해주세요.
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	//내풀이
    public int solution(int[] num_list) {
        int answer = 0;
        String even = "";
        String odd = "";
        for(int i:num_list){
            if(i%2==0) {
            	even+=String.valueOf(i);
            }else {
            	odd+=String.valueOf(i);
            }
        }
        answer=Integer.parseInt(odd)+Integer.parseInt(even);
        return answer;
    }
    //다른풀이
    public int solution2(int[] num_list) {
        int answer = 0;

        int even = 0;
        int odd = 0;

        for(int num : num_list) {
            if(num % 2 == 0) {
                even *= 10;
                even += num;
            } else {
                odd *= 10;
                odd += num;
            }
        }
        answer = even + odd;

        return answer;
    }

}
