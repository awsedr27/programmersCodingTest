package programmersCodingTest;
//boolean 변수 x1, x2, x3, x4가 매개변수로 주어질 때, 다음의 식의 true/false를 return 하는 solution 함수를 작성해 주세요.
public class Basic36 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	//내풀이
    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        boolean answer = true;
        answer=(x1||x2)&&(x3||x4);
        return answer;
    }
    


}
