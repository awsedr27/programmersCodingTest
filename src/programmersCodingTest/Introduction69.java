package programmersCodingTest;


public class Introduction69 {
//문자열 str1, str2가 매개변수로 주어집니다. str1 안에 str2가 있다면 1을 없다면 2를 return하도록 solution 함수를 완성해주세요.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	//내풀이
    public int solution(String str1, String str2) {
        int answer = 0;
        if(str1.contains(str2)){
            answer=1;
        }else{
            answer=2;
        }
        return answer;
    }
}
