package programmersCodingTest;
//알파벳 대소문자로만 이루어진 문자열 my_string이 주어질 때, my_string에서 'A'의 개수, my_string에서 'B'의 개수,..., my_string에서 'Z'의 개수, my_string에서 'a'의 개수, my_string에서 'b'의 개수,..., my_string에서 'z'의 개수를 순서대로 담은 길이 52의 정수 배열을 return 하는 solution 함수를 작성해 주세요.
public class Basic51 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	//내풀이
    public int[] solution(String my_string) {
        int[] answer=new int[52];
        for(char a:my_string.toCharArray()){
            if(Character.isUpperCase(a)){
                answer[a - 'A']+=1;
            }else{
                answer[a-'A'-6]+=1;
            }
        }
       
        return answer;
    }
}
