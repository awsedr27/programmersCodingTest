package programmersCodingTest;

import java.util.Arrays;

public class Introduction63 {
//my_string은 "3 + 5"처럼 문자열로 된 수식입니다. 문자열 my_string이 매개변수로 주어질 때, 수식을 계산한 값을 return 하는 solution 함수를 완성해주세요.
	public static void main(String[] args) {
		solution("1 + 2");
	}
	//내풀이
    public static int solution(String my_string) {
        int answer = 0;
        String operator="";
        for(String text:my_string.split(" ")){
        	if(text.equals("+")) {
        		operator="+";
        	}else if(text.equals("-")) {
        		operator="-";
        	}else {
        		if(operator.equals("+")) {
        			answer+=Integer.parseInt(text);
        		}else if(operator.equals("-")) {
        			answer-=Integer.parseInt(text);
        		}else {
        			answer=Integer.parseInt(text);
        		}
        	}
        }
        return answer;
    }
}
