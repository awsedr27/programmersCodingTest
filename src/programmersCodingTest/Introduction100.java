package programmersCodingTest;


public class Introduction100 {
//등차수열 혹은 등비수열 common이 매개변수로 주어질 때, 마지막 원소 다음으로 올 숫자를 return 하도록 solution 함수를 완성해보세요.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	//내풀이
    public int solution(int[] common) {
        if(common[1]-common[0]==common[2]-common[1]){
            return common[common.length-1]+common[1]-common[0];
        }else{
            return common[common.length-1]*(common[1]/common[0]);
        }
    }
}
