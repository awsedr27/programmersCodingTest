package programmersCodingTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Introduction46 {
//문자열 my_string이 매개변수로 주어질 때, my_string 안에 있는 숫자만 골라 오름차순 정렬한 리스트를 return 하도록 solution 함수를 작성해보세요.


	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	//내풀이
    public int[] solution(String my_string) {
        List<Integer> list=new ArrayList<Integer>();
        for(char c:my_string.toCharArray()){
            if(Character.isDigit(c)){
                list.add(Integer.parseInt(String.valueOf(c)));
            }
        }
        Collections.sort(list);
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
