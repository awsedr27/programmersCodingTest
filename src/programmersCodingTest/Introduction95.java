package programmersCodingTest;

import java.util.Arrays;

public class Introduction95 {
//문자열 before와 after가 매개변수로 주어질 때, before의 순서를 바꾸어 after를 만들 수 있으면 1을, 만들 수 없으면 0을 return 하도록 solution 함수를 완성해보세요.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solution("olleh","hello");
	}
	//내풀이
    public static int solution(String before, String after) {
    	String[] a=before.split("");
    	String[] b=after.split("");
    	String.join("", a);
        Arrays.sort(a);
        Arrays.sort(b);
        if(String.join("", a).equals(String.join("", b))){
            return 1;
        }else{
            return 0;
        }
    }
}
