package programmersCodingTest;


public class Introduction85 {
//3x 마을 사람들은 3을 저주의 숫자라고 생각하기 때문에 3의 배수와 숫자 3을 사용하지 않습니다. 3x 마을 사람들의 숫자는 다음과 같습니다.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	//내풀이
    public int solution(int n) {
        int answer = 1;
        int cnt=1;
        while(n!=cnt){
            answer++;
            while(answer%3==0||String.valueOf(answer).contains("3")){
                answer++;
            }
            cnt++;
        }
        return answer;
    }
}
