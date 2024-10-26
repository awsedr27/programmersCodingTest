package programmersCodingTest;

import java.util.stream.IntStream;

public class Basic62 {
//정수 리스트 num_list와 정수 n이 주어질 때, num_list를 n 번째 원소 이후의 원소들과 n 번째까지의 원소들로 나눠 n 번째 원소 이후의 원소들을 n 번째까지의 원소들 앞에 붙인 리스트를 return하도록 solution 함수를 완성해주세요.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	//내풀이
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length];
        for(int i=0,j=n;i<num_list.length-n;i++){
            answer[i]=num_list[j++];
        }
        for(int k=num_list.length-n,l=0;k<num_list.length;k++){
            answer[k]=num_list[l++];
        }
        return answer;
    }
    //다른풀이
    public int[] solution2(int[] num_list, int n) {
        return IntStream.range(0, num_list.length).map(i -> num_list[(i + n) % num_list.length]).toArray();
    }
}
