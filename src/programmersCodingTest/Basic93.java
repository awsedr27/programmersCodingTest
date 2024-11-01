package programmersCodingTest;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Basic93 {
//아무 원소도 들어있지 않은 빈 배열 X가 있습니다. 길이가 같은 정수 배열 arr과 boolean 배열 flag가 매개변수로 주어질 때, flag를 차례대로 순회하며 flag[i]가 true라면 X의 뒤에 arr[i]를 arr[i] × 2 번 추가하고, flag[i]가 false라면 X에서 마지막 arr[i]개의 원소를 제거한 뒤 X를 return 하는 solution 함수를 작성해 주세요.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	//내풀이
    public int[] solution(int[] arr, boolean[] flag) {
        
        List<Integer> list=new ArrayList<Integer>();
        for(int i=0;i<arr.length;i++){
            if(flag[i]){
                for(int j=0;j<arr[i]*2;j++){
                    list.add(arr[i]);
                }
            }else{
                for(int k=0;k<arr[i];k++){
                    list.remove(list.size()-1);
                }
            }
        }
        int[] answer = new int[list.size()];
        for(int i=0;i<list.size();i++){
            answer[i]=list.get(i);
        }
        return answer;
    }
    //다른풀이
    public int[] solution2(int[] arr, boolean[] flag) {
        String answer = "";

        for(int idx=0; idx<arr.length; idx++) {
            if(flag[idx]) {
                answer += String.valueOf(arr[idx]).repeat(arr[idx]*2);
            }
            else {
                answer = answer.substring(0, answer.length() - arr[idx]);
            }
        }

        return Stream.of(answer.split("")).mapToInt(Integer::parseInt).toArray();
    }
}
