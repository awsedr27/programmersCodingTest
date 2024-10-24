package programmersCodingTest;

import java.util.ArrayList;
import java.util.List;

//정수 start_num와 end_num가 주어질 때, start_num에서 end_num까지 1씩 감소하는 수들을 차례로 담은 리스트를 return하도록 solution 함수를 완성해주세요.
public class Basic54 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	//내풀이
    public int[] solution(int start_num, int end_num) {
        List<Integer> list=new ArrayList<Integer>();
        while(start_num>=end_num){
            list.add(start_num);
            start_num--;
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
