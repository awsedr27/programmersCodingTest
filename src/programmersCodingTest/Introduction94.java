package programmersCodingTest;


public class Introduction94 {
//이진수를 의미하는 두 개의 문자열 bin1과 bin2가 매개변수로 주어질 때, 두 이진수의 합을 return하도록 solution 함수를 완성해주세요.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	//내풀이
    public String solution(String bin1, String bin2) {
        int a=Integer.parseUnsignedInt(bin1, 2)+Integer.parseUnsignedInt(bin2, 2);
        return Integer.toBinaryString(a);
    }
}
