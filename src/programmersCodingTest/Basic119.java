package programmersCodingTest;


public class Basic119 {
//알파벳 소문자로 이루어진 문자열 myString이 주어집니다. 알파벳 순서에서 "l"보다 앞서는 모든 문자를 "l"로 바꾼 문자열을 return 하는 solution 함수를 완성해 주세요.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	//내풀이
    public String solution(String myString) {
        StringBuilder sb=new StringBuilder();
        for(char a:myString.toCharArray()){
            if(a<'l'){
                sb.append('l');
            }else{
                sb.append(a);
            }
        }
        return sb.toString();
    }
    
}
