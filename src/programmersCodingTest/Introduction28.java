package programmersCodingTest;


public class Introduction28 {
//정수 n이 주어질 때, n이하의 짝수를 모두 더한 값을 return 하도록 solution 함수를 작성해주세요.


	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	//내풀이
    public int solution(int n) {
        int answer = 0;
        while(n>0){
            if(n%2==0){
                answer+=n;
            }
            n--;
        }
        return answer;
    }
}
