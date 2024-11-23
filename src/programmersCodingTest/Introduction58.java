package programmersCodingTest;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Introduction58 {
//문자열 my_string과 정수 num1, num2가 매개변수로 주어질 때, my_string에서 인덱스 num1과 인덱스 num2에 해당하는 문자를 바꾼 문자열을 return 하도록 solution 함수를 완성해보세요.


	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	//내풀이
    public String solution(String my_string, int num1, int num2) {
        String answer = "";
        List<String> list=Arrays.asList(my_string.split(""));
        Collections.swap(list,num1,num2);
        answer=String.join("",list);
        return answer;
    }
    //다른풀이
    public String solution2(String my_string, int num1, int num2) {
        String answer = "";

        char[] ch = my_string.toCharArray();

        ch[num1] = my_string.charAt(num2);
        ch[num2] = my_string.charAt(num1);

        answer = String.valueOf(ch);
        return answer;
    }
}
