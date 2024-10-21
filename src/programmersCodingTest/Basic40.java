package programmersCodingTest;

import java.util.ArrayList;
import java.util.List;
//문자열 my_string과 이차원 정수 배열 queries가 매개변수로 주어집니다. queries의 원소는 [s, e] 형태로, my_string의 인덱스 s부터 인덱스 e까지를 뒤집으라는 의미입니다. my_string에 queries의 명령을 순서대로 처리한 후의 문자열을 return 하는 solution 함수를 작성해 주세요.

public class Basic40 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solution("rermgorpsam",new int[][] {{2,3},{0,7},{5,9},{6,10}});
	}
	//내풀이
    public static String solution(String my_string, int[][] queries) {
        String answer = my_string;
        for(int[] query:queries){
        	answer=answer.substring(0, query[0])+swap(answer.substring(query[0],query[1]+1))+answer.substring(query[1]+1, answer.length());
        }
        return answer;
    }
    public static String swap(String text){
        char[] a=text.toCharArray();
        String result="";
        for(int i=text.length()-1;i>=0;i--){
            result+=String.valueOf(a[i]);
        }
        return result;
    }
    //다른풀이
    char[] arr;

    public String solution2(String my_string, int[][] queries) {

        arr = my_string.toCharArray();

        for (int[] query : queries) {
            reverse(query[0], query[1]);
        }

        return new String(arr);
    }

    private void reverse(int s, int e) {
        while (s < e) {
            char temp = arr[s];
            arr[s++] = arr[e];
            arr[e--] = temp;
        }
    }


}
