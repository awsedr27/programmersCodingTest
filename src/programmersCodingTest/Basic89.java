package programmersCodingTest;



public class Basic89 {
//문자 "A"와 "B"로 이루어진 문자열 myString과 pat가 주어집니다. myString의 "A"를 "B"로, "B"를 "A"로 바꾼 문자열의 연속하는 부분 문자열 중 pat이 있으면 1을 아니면 0을 return 하는 solution 함수를 완성하세요.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	//내풀이
    public int solution(String myString, String pat) {
        myString=myString.replace("A","-");
        myString=myString.replace("B","A");
        myString=myString.replace("-","B");
        if(myString.indexOf(pat)==-1){
            return 0;
        }else{
            return 1;
        }
    }
    
}