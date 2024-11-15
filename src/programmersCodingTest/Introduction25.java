package programmersCodingTest;


public class Introduction25 {
//문자열 my_string과 문자 letter이 매개변수로 주어집니다. my_string에서 letter를 제거한 문자열을 return하도록 solution 함수를 완성해주세요.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	//내풀이
    public String solution(String my_string, String letter) {
        StringBuilder sb=new StringBuilder();
        for(String s:my_string.split("")){
            if(!s.equals(letter)){
                sb.append(s);
            }
        }
        return sb.toString();
    }
}
