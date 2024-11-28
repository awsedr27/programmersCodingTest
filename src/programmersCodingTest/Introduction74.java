package programmersCodingTest;


public class Introduction74 {
//문자열 my_str과 n이 매개변수로 주어질 때, my_str을 길이 n씩 잘라서 저장한 배열을 return하도록 solution 함수를 완성해주세요.
	public static void main(String[] args) {
		solution("abcdef123",3);
	}
	//내풀이
    public static String[] solution(String my_str, int n) {
        int i=my_str.length()%n==0?my_str.length()/n:my_str.length()/n+1;
        String[] answer = new String[i];
        String text="";
        int cnt=0;
        String[] arr=my_str.split("");
        for(int j=0;j<arr.length;j++){
            text+=arr[j];
            if(text.length()==n||j==arr.length-1){
                answer[cnt++]=text;
                text="";
            }
        }
        return answer;
    }
}
