package programmersCodingTest;

import java.util.ArrayList;
import java.util.List;

public class Basic109 {
//정수 배열 arr과 delete_list가 있습니다. arr의 원소 중 delete_list의 원소를 모두 삭제하고 남은 원소들은 기존의 arr에 있던 순서를 유지한 배열을 return 하는 solution 함수를 작성해 주세요.


	public static void main(String[] args) {
		solution(new int[] {293, 1000, 395, 678, 94},new int[] {94, 777, 104, 1000, 1, 12});
	}
	//내풀이
    public static int[] solution(int[] arr, int[] delete_list) {
        List<Integer> list =new ArrayList<Integer>();
        
        for(int k=0;k<arr.length;k++){
            list.add(arr[k]);
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<delete_list.length;j++){
            	if(list.contains(delete_list[j])) {
            		list.remove(list.indexOf(delete_list[j]));
            	}
            }
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
    //다른풀이
    public int[] solution2(int[] arr, int[] delete_list) {
        ArrayList<Integer> al = new ArrayList<>();

        for (int i  : arr) {
            al.add(i);
        }

        for (int i : delete_list) {
            al.remove(Integer.valueOf(i));
        }
        return al.stream().mapToInt(i -> i).toArray();
    }
    
}
