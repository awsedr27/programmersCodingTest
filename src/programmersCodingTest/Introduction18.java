package programmersCodingTest;


public class Introduction18 {
//머쓱이는 추운 날에도 아이스 아메리카노만 마십니다. 아이스 아메리카노는 한잔에 5,500원입니다. 머쓱이가 가지고 있는 돈 money가 매개변수로 주어질 때, 머쓱이가 최대로 마실 수 있는 아메리카노의 잔 수와 남는 돈을 순서대로 담은 배열을 return 하도록 solution 함수를 완성해보세요.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	//내풀이
    public int[] solution(int money) {
        int[] answer = new int[2];;
        int num=0;
        while(true){
            if(money<num*5500){
                break;
            }
            num++;
        }
        num--;
        answer[0]=num;
        answer[1]=money-num*5500;
        return answer;
    }
    
    //다른풀이
    public int[] solution2(int money) {
        int[] answer = new int[2];
        answer[0] = money/5500;
        answer[1] = money%5500;
        return answer;
    }
}
