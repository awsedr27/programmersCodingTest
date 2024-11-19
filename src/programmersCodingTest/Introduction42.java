package programmersCodingTest;


public class Introduction42 {
//약수의 개수가 세 개 이상인 수를 합성수라고 합니다. 자연수 n이 매개변수로 주어질 때 n이하의 합성수의 개수를 return하도록 solution 함수를 완성해주세요.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	//내풀이
    public int solution(int n) {
        int answer = 0;
        while(n>3){
            for(int j=n-1;j>1;j--){
                if(n%j==0){
                    answer++;
                    break;
                }
            }
            n--;
        }
        return answer;
    }
}
