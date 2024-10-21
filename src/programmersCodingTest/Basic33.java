package programmersCodingTest;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

//정수 start_num와 end_num가 주어질 때, start_num부터 end_num까지의 숫자를 차례로 담은 리스트를 return하도록 solution 함수를 완성해주세요.
public class Basic33 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	//내풀이
    public int[] solution(int start_num, int end_num) {
        List<Integer> list=new ArrayList();
        for(;start_num<=end_num;start_num++){
            list.add(start_num);
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
    //다른풀이
    public int[] solution2(int start, int end) {
        return IntStream.rangeClosed(start, end).toArray();
    }

}
