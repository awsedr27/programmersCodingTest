package programmersCodingTest;

public class Basic16 {
//정수 num과 n이 매개 변수로 주어질 때, num이 n의 배수이면 1을 return n의 배수가 아니라면 0을 return하도록 solution 함수를 완성해주세요.
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	//내풀이
    public int solution(int num, int n) {
        int answer = 0;
        answer=(num%n==0)?1:0;
        return answer;
    }

}
