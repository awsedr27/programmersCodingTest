package programmersCodingTest;


public class Introduction45 {
//영어에선 a, e, i, o, u 다섯 가지 알파벳을 모음으로 분류합니다. 문자열 my_string이 매개변수로 주어질 때 모음을 제거한 문자열을 return하도록 solution 함수를 완성해주세요.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	//내풀이
    public String solution(String my_string) {
        String answer = "";
        for(String text:my_string.split("")){
            if(!text.equals("a")&&!text.equals("e")&&
              !text.equals("i")&&!text.equals("o")&&
              !text.equals("u")){
                answer+=text;
            }
        }
        return answer;
    }
}
