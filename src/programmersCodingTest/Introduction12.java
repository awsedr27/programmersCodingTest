package programmersCodingTest;

import java.util.ArrayList;
import java.util.List;

public class Introduction12 {
//정수 n이 매개변수로 주어질 때, n 이하의 홀수가 오름차순으로 담긴 배열을 return하도록 solution 함수를 완성해주세요.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	//내풀이
    public int[] solution(int n) {
        List<Integer> list=new ArrayList<Integer>();
        for(int i=1;i<=n;i++){
            if(i%2==1){
                list.add(i);
            }
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
