package programmersCodingTest;
//문자열 my_string과 정수 n이 매개변수로 주어질 때, my_string의 앞의 n글자로 이루어진 문자열을 return 하는 solution 함수를 작성해 주세요.
public class Basic46 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	//내풀이
    public String solution(String my_string, int n) {
        String answer = "";
        answer=my_string;
        return answer.substring(0,n);
    }

}
