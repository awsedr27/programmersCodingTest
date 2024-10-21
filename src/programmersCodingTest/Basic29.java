package programmersCodingTest;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

//정수 배열 arr와 2차원 정수 배열 queries이 주어집니다. queries의 원소는 각각 하나의 query를 나타내며, [i, j] 꼴입니다.
//
//각 query마다 순서대로 arr[i]의 값과 arr[j]의 값을 서로 바꿉니다.
//
//위 규칙에 따라 queries를 처리한 이후의 arr를 return 하는 solution 함수를 완성해 주세요.
public class Basic29 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	//내풀이
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = {};
        for(int k=0;k<queries.length;k++){
            int temp=0;
            int i=queries[k][0];
            int j=queries[k][1];
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
        answer=arr;
        return answer;
    }
//다른풀이
    public List<Integer> solution2(int[] arr, int[][] queries) {
        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());

        for (int[] query : queries) {
            Collections.swap(list, query[0], query[1]);
        }
        return list;
    }
}
