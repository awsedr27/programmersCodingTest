package programmersCodingTest;


public class Introduction65 {
//정수 num과 k가 매개변수로 주어질 때, num을 이루는 숫자 중에 k가 있으면 num의 그 숫자가 있는 자리 수를 return하고 없으면 -1을 return 하도록 solution 함수를 완성해보세요.


	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	//내풀이
    public int solution(int num, int k) {
        int answer = -1;
        int cnt=1;
        int m=String.valueOf(num).length()+1;
        while(num>0){
            if(num%10==k){
                answer=m-cnt;
            }
            num/=10;
            cnt++;
        }
        return answer;
    }
}
