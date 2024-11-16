package programmersCodingTest;


public class Introduction24 {
//문자열 my_string과 정수 n이 매개변수로 주어질 때, my_string에 들어있는 각 문자를 n만큼 반복한 문자열을 return 하도록 solution 함수를 완성해보세요.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	//내풀이
    public String solution(String my_string, int n) {
        StringBuilder sb=new StringBuilder();
        for(char c:my_string.toCharArray()){
            sb.append(String.valueOf(c).repeat(n));
        }
        return sb.toString();
    }
}