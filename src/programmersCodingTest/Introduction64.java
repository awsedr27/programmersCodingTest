package programmersCodingTest;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Introduction64 {
//두 배열이 얼마나 유사한지 확인해보려고 합니다. 문자열 배열 s1과 s2가 주어질 때 같은 원소의 개수를 return하도록 solution 함수를 완성해주세요.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	//내풀이
    public int solution(String[] s1, String[] s2) {
        int answer = 0;
        for(String text:s1){
            for(String text2:s2){
                if(text.equals(text2)){
                    answer++;
                }
            }
        }
        return answer;
    }
    //다른풀이
    public int solution2(String[] s1, String[] s2) {
        int answer = 0;
        Set<String> set=new HashSet<String>();
        for(String text:s1) {
        	set.add(text);
        }
        for(String text2:s2) {
        	if(set.contains(text2)) {
        		answer++;
        	}
        }
        return answer;
    }
}
