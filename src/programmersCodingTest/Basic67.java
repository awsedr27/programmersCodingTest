package programmersCodingTest;

import java.util.ArrayList;
import java.util.List;

public class Basic67 {
	//최대 5명씩 탑승가능한 놀이기구를 타기 위해 줄을 서있는 사람들의 이름이 담긴 문자열 리스트 names가 주어질 때, 앞에서 부터 5명씩 묶은 그룹의 가장 앞에 서있는 사람들의 이름을 담은 리스트를 return하도록 solution 함수를 완성해주세요. 마지막 그룹이 5명이 되지 않더라도 가장 앞에 있는 사람의 이름을 포함합니다.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	//내풀이
    public String[] solution(String[] names) {
        
        List<String> list=new ArrayList<String>();
        for(int i=0;i<names.length;i++){
            if(i%5==0){
                list.add(names[i]);
            }
        }
        String[] answer = new String[list.size()];
        for(int i=0;i<list.size();i++){
            answer[i]=list.get(i);
        }
        return answer;
    }
    //다른풀이
    public String[] solution2(String[] names) {
        String[] answer = new String[(names.length-1)/5+1];
        for(int i=0; i<answer.length; i++) {
            answer[i] = names[5*i];
        }
        return answer;
    }
}
