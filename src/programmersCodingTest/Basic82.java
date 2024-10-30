package programmersCodingTest;

public class Basic82 {
//문자열 myString과 pat이 주어집니다. myString에서 pat이 등장하는 횟수를 return 하는 solution 함수를 완성해 주세요.


	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	//내풀이
    public int solution(String myString, String pat) {
        int answer = 0;
        while(myString.indexOf(pat)!=-1){
            myString=myString.substring(myString.indexOf(pat)+1,myString.length());
            answer++;
        }
        return answer;
    }
    //다른풀이
    public int solution2(String myString, String pat) {

        int idx = myString.indexOf(pat);
        return idx == -1 ? 0 : (1 + solution(myString.substring(idx + 1), pat));
    }
    //다른풀이
    public int solution3(String myString, String pat) {
        int answer = 0;
        int index = myString.indexOf(pat);
        while (index != -1) {
            answer++;
            index = myString.indexOf(pat, index + 1);
        }
        return answer;
    }
}
