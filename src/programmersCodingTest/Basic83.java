package programmersCodingTest;

import java.util.ArrayList;
import java.util.List;

public class Basic83 {
//문자열 배열 strArr가 주어집니다. 배열 내의 문자열 중 "ad"라는 부분 문자열을 포함하고 있는 모든 문자열을 제거하고 남은 문자열을 순서를 유지하여 배열로 return 하는 solution 함수를 완성해 주세요.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	//내풀이
    public String[] solution(String[] strArr) {
        
        List<String> list=new ArrayList<String>();
        for(String text:strArr){
            if(!text.contains("ad")){
                list.add(text);
            }
        }
        String[] answer = new String[list.size()];
        for(int i=0;i<list.size();i++){
            answer[i]=list.get(i);
        }
        return answer;
    }
}
