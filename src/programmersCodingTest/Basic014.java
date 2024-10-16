package programmersCodingTest;

public class Basic014 {
//연산 ⊕는 두 정수에 대한 연산으로 두 정수를 붙여서 쓴 값을 반환합니다. 예를 들면 다음과 같습니다.
//
//12 ⊕ 3 = 123
//3 ⊕ 12 = 312
//양의 정수 a와 b가 주어졌을 때, a ⊕ b와 b ⊕ a 중 더 큰 값을 return 하는 solution 함수를 완성해 주세요.
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
    public static int solution(int a, int b) {
        int answer = 0;
        String result1=Integer.toString(a)+Integer.toString(b);
        String result2=Integer.toString(b)+Integer.toString(a);
        
        int parseInt1=Integer.parseInt(result1);
        int parseInt2=Integer.parseInt(result2);
        if(parseInt1>=parseInt2) {
        	answer=parseInt1;
        }else {
        	answer=parseInt2;
        }
       
        return answer;
    }
    //다른풀이
    public int solution2(int a, int b) {
        String strA = String.valueOf(a);
        String strB = String.valueOf(b);
        String strSum1 = strA + strB;
        String strSum2 = strB + strA;
        return Math.max(Integer.valueOf(strSum1), Integer.valueOf(strSum2));
    }

}
