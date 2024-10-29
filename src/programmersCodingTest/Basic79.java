package programmersCodingTest;

//문자열 myString이 주어집니다. myString에서 알파벳 "a"가 등장하면 전부 "A"로 변환하고, "A"가 아닌 모든 대문자 알파벳은 소문자 알파벳으로 변환하여 return 하는 solution 함수를 완성하세요.
public class Basic79 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	//내풀이
    public String solution(String myString) {
        char[] text=myString.toCharArray();
        for(int i=0;i<text.length;i++){
            if('a'==text[i]){
                text[i]='A';
            }else if(Character.isUpperCase(text[i])&&'A'!=text[i]) {
            	text[i]=Character.toLowerCase(text[i]);
            }
        }

        return String.valueOf(text);
    }
    //다른풀이
    public String solution2(String myString) {
        myString = myString.toLowerCase();
        myString = myString.replace('a', 'A');

        return myString;
    }
}
