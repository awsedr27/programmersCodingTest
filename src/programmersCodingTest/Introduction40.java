package programmersCodingTest;


public class Introduction40 {
//정수가 담긴 배열 numbers와 문자열 direction가 매개변수로 주어집니다. 배열 numbers의 원소를 direction방향으로 한 칸씩 회전시킨 배열을 return하도록 solution 함수를 완성해주세요.


	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	//내풀이
    public int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];
        if("right".equals(direction)){
            answer[0]=numbers[numbers.length-1];
            for(int i=1;i<numbers.length;i++){
                answer[i]=numbers[i-1];
            }
        }else{
            answer[answer.length-1]=numbers[0];
            for(int i=0;i<numbers.length-1;i++){
                answer[i]=numbers[i+1];
            }
        }
        return answer;
    }
}
