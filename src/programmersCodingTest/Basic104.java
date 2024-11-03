package programmersCodingTest;


public class Basic104 {
//한 자리 정수로 이루어진 문자열 num_str이 주어질 때, 각 자리수의 합을 return하도록 solution 함수를 완성해주세요.


	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	//내풀이
    public int solution(String num_str) {
        int answer = 0;
        String[] a=num_str.split("");
        for(String text:a){
            answer+=Integer.parseInt(text);
        }
        return answer;
    }
    
}
