package programmersCodingTest;

public class Basic015 {
//	연산 ⊕는 두 정수에 대한 연산으로 두 정수를 붙여서 쓴 값을 반환합니다. 예를 들면 다음과 같습니다.
//
//	12 ⊕ 3 = 123
//	3 ⊕ 12 = 312
//	양의 정수 a와 b가 주어졌을 때, a ⊕ b와 2 * a * b 중 더 큰 값을 return하는 solution 함수를 완성해 주세요.
//
//	단, a ⊕ b와 2 * a * b가 같으면 a ⊕ b를 return 합니다.
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	//내풀이
    public int solution(int a, int b) {
        int answer = 0;
        int result1=Integer.parseInt(String.valueOf(a)+String.valueOf(b));
        int result2=2*a*b;
        answer=Math.max(result1,result2);
        return answer;
    }

}
