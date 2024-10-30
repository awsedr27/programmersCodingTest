package programmersCodingTest;

import java.util.ArrayList;
import java.util.List;

public class Basic85 {
//단어가 공백 한 개 이상으로 구분되어 있는 문자열 my_string이 매개변수로 주어질 때, my_string에 나온 단어를 앞에서부터 순서대로 담은 문자열 배열을 return 하는 solution 함수를 작성해 주세요.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	//내풀이
    public String[] solution(String my_string) {
        String[] answer = my_string.split(" ");
        List<String> list=new ArrayList<String>();
        for(String text:answer){
            if(!text.equals("")){
                list.add(text);
            }
        }
        return list.toArray(String[]::new);
    }
    //다른풀이
    public String[] solution2(String my_string) {
        return my_string.trim().split("[ ]+");
    }
    //다른풀이
    public String[] solution3(String myString) {
        return myString.trim().split("\\s+");
    }
    
}
