package programmersCodingTest;


public class Introduction47 {
//문자열 my_string이 매개변수로 주어집니다. my_string안의 모든 자연수들의 합을 return하도록 solution 함수를 완성해주세요.


	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	//내풀이
    public int solution(String my_string) {
        int answer = 0;
        for(char c:my_string.toCharArray()){
            if(Character.isDigit(c)){
                answer+=Integer.parseInt(String.valueOf(c));
            }
        }
        return answer;
    }
}
