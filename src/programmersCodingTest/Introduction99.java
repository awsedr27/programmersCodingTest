package programmersCodingTest;


public class Introduction99 {
//연속된 세 개의 정수를 더해 12가 되는 경우는 3, 4, 5입니다. 두 정수 num과 total이 주어집니다. 연속된 수 num개를 더한 값이 total이 될 때, 정수 배열을 오름차순으로 담아 return하도록 solution함수를 완성해보세요.
	public static void main(String[] args) {
		solution(5,5);
	}
	//내풀이
    public static int[] solution(int num, int total) {
        int[] answer = new int[num];
        double numSum=0.0;
        int cnt=0;
        while(num-cnt>=2){
            numSum+=num-cnt;
            cnt++;
        }
        double x=Math.ceil((total-numSum)/num);
        for(int i=0;i<answer.length;i++){
            answer[i]=(int)x;
            x++;
        }
        return answer;
    }
}
