package programmersCodingTest;

import java.util.ArrayList;
import java.util.List;

public class Basic65 {
//정수 리스트 num_list와 정수 n이 주어질 때, num_list의 첫 번째 원소부터 마지막 원소까지 n개 간격으로 저장되어있는 원소들을 차례로 담은 리스트를 return하도록 solution 함수를 완성해주세요.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	//내풀이
    public int[] solution(int[] num_list, int n) {
        List<Integer> list=new ArrayList<Integer>();
        for(int i=0;i<num_list.length;i+=n){
            list.add(num_list[i]);
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
