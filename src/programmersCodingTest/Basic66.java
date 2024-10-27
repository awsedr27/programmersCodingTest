package programmersCodingTest;


public class Basic66 {
	//정수 리스트 num_list가 주어집니다. 가장 첫 번째 원소를 1번 원소라고 할 때, 홀수 번째 원소들의 합과 짝수 번째 원소들의 합 중 큰 값을 return 하도록 solution 함수를 완성해주세요. 두 값이 같을 경우 그 값을 return합니다.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	//내풀이
    public int solution(int[] num_list) {
        int answer = 0;
        int odd=0;
        int even=0;
        for(int i=0;i<num_list.length;i++){
            if(i%2==0){
                even+=num_list[i];
            }else{
                odd+=num_list[i];
            }
        }
        answer= (even==odd)? even: Math.max(even,odd); 
        return answer;
    }
    //다른풀이
    public int solution2(int[] num_list) {
        int a = 0;
        int b = 0;

        for(int idx=0; idx<num_list.length; idx++) {
            if(idx%2==0) {
                b += num_list[idx];
            }
            else {
                a += num_list[idx];
            }
        }

        return Math.max(a,b);
    }
}
