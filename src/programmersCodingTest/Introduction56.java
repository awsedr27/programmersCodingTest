package programmersCodingTest;


public class Introduction56 {
//문자열 my_string이 매개변수로 주어질 때, 대문자는 소문자로 소문자는 대문자로 변환한 문자열을 return하도록 solution 함수를 완성해주세요.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	//내풀이
    public String solution(String my_string) {
        String answer = "";
        for(char c:my_string.toCharArray()){
            if(Character.isUpperCase(c)){
                answer+=String.valueOf(Character.toLowerCase(c));
            }else{
                answer+=String.valueOf(Character.toUpperCase(c));
            }
        }
        return answer;
    }
}
