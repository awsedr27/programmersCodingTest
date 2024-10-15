package programmersCodingTest;

public class Basic010 {
//문자열 my_string, overwrite_string과 정수 s가 주어집니다. 문자열 my_string의 인덱스 s부터 overwrite_string의 길이만큼을 문자열 overwrite_string으로 바꾼 문자열을 return 하는 solution 함수를 작성해 주세요.
	public static void main(String[] args) {
		solution("He11oWor1d","lloWorl",2);
		System.out.print(solution("He11oWor1d","lloWorl",2));
		
	}
    public static String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        answer=my_string.substring(0, s)+overwrite_string;
        if(my_string.substring(s,my_string.length()).length()>overwrite_string.length()) {
        	answer+=my_string.substring(s+overwrite_string.length(), my_string.length());
        }
        
        return answer;
    }
    
    //다른풀이
    public static String solution2(String my_string, String overwrite_string, int s) {
        char[] my_chars = my_string.toCharArray();
        char[] overwrite_chars = overwrite_string.toCharArray();
        for (int i=0; i<overwrite_chars.length; i++) {
            my_chars[s + i] = overwrite_chars[i];
        }
        return String.valueOf(my_chars);
    }
    //다른풀이
    public static String solution3(String my_string, String overwrite_string, int s) {
        String before = my_string.substring(0, s);
        String after = my_string.substring(s + overwrite_string.length());
        return before + overwrite_string + after;
    }

}
