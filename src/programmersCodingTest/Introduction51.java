package programmersCodingTest;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class Introduction51 {
//문자열 my_string이 매개변수로 주어집니다. my_string에서 중복된 문자를 제거하고 하나의 문자만 남긴 문자열을 return하도록 solution 함수를 완성해주세요.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	//내풀이
    public String solution(String my_string) {
        String answer = "";
        for(String a:my_string.split("")){
            if(!answer.contains(a)){
                answer+=a;
            }
        }
        return answer;
    }
    //다른풀이
    public String solution2(String my_string) {
        String[] answer = my_string.split("");
        Set<String> set = new LinkedHashSet<String>(Arrays.asList(answer));

        return String.join("", set);
    }
}
