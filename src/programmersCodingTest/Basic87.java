package programmersCodingTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Basic87 {
//문자열 myString이 주어집니다. "x"를 기준으로 해당 문자열을 잘라내 배열을 만든 후 사전순으로 정렬한 배열을 return 하는 solution 함수를 완성해 주세요.

//단, 빈 문자열은 반환할 배열에 넣지 않습니다.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	//내풀이
    public String[] solution(String myString) {
        String[] answer = myString.split("x");
        List<String> list=new ArrayList<String>();
        Arrays.sort(answer);
        
        for(String text:answer){
            if(!text.equals("")){
                list.add(text);
            }
        }
        
        return list.toArray(String[]::new);
    }
    //다른풀이
    public String[] solution2(String myString) {
        return Arrays.stream(myString.split("x")).filter(s -> !s.isEmpty()).sorted().toArray(String[]::new);
    }
    
}
