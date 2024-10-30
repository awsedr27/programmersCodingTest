package programmersCodingTest;

public class Basic81 {
//문자열 myString과 pat가 주어집니다. myString의 부분 문자열중 pat로 끝나는 가장 긴 부분 문자열을 찾아서 return 하는 solution 함수를 완성해 주세요.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	//내풀이
    public String solution(String myString, String pat) {
        return myString.substring(0,myString.lastIndexOf(pat)+pat.length());
    }
}
