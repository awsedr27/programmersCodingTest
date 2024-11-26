package programmersCodingTest;


public class Introduction67 {
//정수 n이 매개변수로 주어질 때 n의 각 자리 숫자의 합을 return하도록 solution 함수를 완성해주세요


	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	//내풀이
    public int solution(int n) {
        int answer = 0;
        while(n>0){
            answer=answer+n%10;
            n/=10;
        }
        return answer;
    }
}
