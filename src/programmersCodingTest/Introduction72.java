package programmersCodingTest;

import java.util.Arrays;

public class Introduction72 {
//영어 대소문자로 이루어진 문자열 my_string이 매개변수로 주어질 때, my_string을 모두 소문자로 바꾸고 알파벳 순서대로 정렬한 문자열을 return 하도록 solution 함수를 완성해보세요.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	//내풀이
    public String solution(String my_string) {
        String answer = "";
        my_string=my_string.toLowerCase();
        String[] arr=my_string.split("");
        Arrays.sort(arr);
        for(String a:arr){
            answer+=a;
        }
        
        return answer;
    }
}
