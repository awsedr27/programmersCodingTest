package programmersCodingTest;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

//문자열 my_string과 두 정수 m, c가 주어집니다. my_string을 한 줄에 m 글자씩 가로로 적었을 때 왼쪽부터 세로로 c번째 열에 적힌 글자들을 문자열로 return 하는 solution 함수를 작성해 주세요.
public class Basic49 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	//내풀이
    public String solution(String my_string, int m, int c) {
        String answer = "";
        int num=my_string.length()/m;
        char[] text=my_string.toCharArray();
        for(int i=c-1;i<my_string.length();i+=m){
            answer+=String.valueOf(text[i]);
        }
        return answer;
    }

    //다른풀이
    public String solution2(String my_string, int m, int c) {
        String answer = "";

        for (int i = c - 1; i < my_string.length(); i += m) {
            answer += my_string.charAt(i);
        }
        return answer;
    }
    public String solution3(String myString, int m, int c) {
        return IntStream.range(0, myString.length())
            .filter(i -> i % m == c - 1)
            .mapToObj(i -> String.valueOf(myString.charAt(i)))
            .collect(Collectors.joining());
    }
}
