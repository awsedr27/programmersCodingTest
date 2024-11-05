package programmersCodingTest;

import java.math.BigInteger;

public class Basic107 {
//0 이상의 두 정수가 문자열 a, b로 주어질 때, a + b의 값을 문자열로 return 하는 solution 함수를 작성해 주세요.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	//내풀이
    public String solution(String a, String b) {
        BigInteger bigValue = new BigInteger(a);
        BigInteger bigValue2 = new BigInteger(b);
        return ""+bigValue.add(bigValue2);
    }
    
    //다른풀이
    public String solution2(String a, String b) {
        BigInteger a1 = new BigInteger(a);
        BigInteger b1 = new BigInteger(b);


        return a1.add(b1).toString();
    }
    
}
