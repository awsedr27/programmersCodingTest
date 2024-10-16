package programmersCodingTest;

public class Basic011 {
//길이가 같은 두 문자열 str1과 str2가 주어집니다.두 문자열의 각 문자가 앞에서부터 서로 번갈아가면서 한 번씩 등장하는 문자열을 만들어 return 하는 solution 함수를 완성해 주세요.
	public static void main(String[] args) {
		System.out.print(solution("aaaaa","bbbbb"));

	}
//내풀이
    public static String solution(String str1, String str2) {
        String answer = "";
        for(int i=0;i<str1.length();i++)
        {
        	answer+=Character.toString(str1.charAt(i))+Character.toString(str2.charAt(i));
        }
        return answer;
    }
    //다른풀이
//    public String solution(String str1, String str2) {
//        String answer = "";
//
//        for(int i = 0; i < str1.length(); i++){
//            answer+= str1.charAt(i);
//            answer+= str2.charAt(i);
//        }
//
//        return answer;
//    }
}
