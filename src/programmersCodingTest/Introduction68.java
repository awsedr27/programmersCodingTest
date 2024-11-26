package programmersCodingTest;


public class Introduction68 {
//덧셈, 뺄셈 수식들이 'X [연산자] Y = Z' 형태로 들어있는 문자열 배열 quiz가 매개변수로 주어집니다. 수식이 옳다면 "O"를 틀리다면 "X"를 순서대로 담은 배열을 return하도록 solution 함수를 완성해주세요.


	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	//내풀이
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        for(int i=0;i<quiz.length;i++){
            String[] text=quiz[i].split(" ");
            int firstNum=Integer.parseInt(text[0]);
            String operator=text[1];
            int secondNum=Integer.parseInt(text[2]);
            int result=Integer.parseInt(text[4]);
            
            if(operator.equals("-")){
                if(firstNum-secondNum==result) {
                	answer[i]="O";
                }else {
                	answer[i]="X";
                }
            }else{
                if(firstNum+secondNum==result) {
                	answer[i]="O";
                }else {
                	answer[i]="X";
                }            }
        }
        return answer;
    }
}
