package programmersCodingTest;


public class Introduction70 {
//어떤 자연수를 제곱했을 때 나오는 정수를 제곱수라고 합니다. 정수 n이 매개변수로 주어질 때, n이 제곱수라면 1을 아니라면 2를 return하도록 solution 함수를 완성해주세요.
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	//내풀이
    public int solution(int n) {
        int answer = 2;
        int cnt=1;
        while(n>=cnt*cnt){
            if(n==cnt*cnt){
                answer=1;
                break;
            }
            cnt++;
        }
        return answer;
    }

}
