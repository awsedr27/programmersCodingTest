package programmersCodingTest;


public class Introduction23 {
//정수가 담긴 리스트 num_list가 주어질 때, num_list의 원소 중 짝수와 홀수의 개수를 담은 배열을 return 하도록 solution 함수를 완성해보세요.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	//내풀이
    public int[] solution(int[] num_list) {
        int[] answer = new int[2];
        int cntEven=0;
        int cntOdd=0;
        for(int i:num_list){
            if(i%2==0){
                cntEven++;
            }else{
                cntOdd++;
            }
        }
        answer[0]=cntEven;
        answer[1]=cntOdd;
        return answer;
    }
}
