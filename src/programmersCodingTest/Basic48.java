package programmersCodingTest;
//문자열 my_string과 정수 s, e가 매개변수로 주어질 때, my_string에서 인덱스 s부터 인덱스 e까지를 뒤집은 문자열을 return 하는 solution 함수를 작성해 주세요.
public class Basic48 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	//내풀이
    public String solution(String my_string, int s, int e) {
        String answer = "";
        char[] text=my_string.toCharArray();
        String reverse="";
        for(int i=e;i>=s;i--){
            reverse+=String.valueOf(text[i]);
        }
        answer=my_string.substring(0,s)+reverse+my_string.substring(e+1);
        return answer;
    }
    //다른풀이
    public String solution2(String my_string, int s, int e) {
        StringBuilder answer = new StringBuilder(my_string.substring(s, e + 1));
        answer.reverse();
        return my_string.substring(0, s) + answer + my_string.substring(e + 1);
    }

}
