package programmersCodingTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Basic59 {
//정수 배열 arr가 주어집니다. 배열 안의 2가 모두 포함된 가장 작은 연속된 부분 배열을 return 하는 solution 함수를 완성해 주세요.

//단, arr에 2가 없는 경우 [-1]을 return 합니다.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	//내풀이
    public int[] solution(int[] arr) {
        
        List<Integer> list=new ArrayList<Integer>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]==2){
                list.add(i);
            }
        }
        
        if(list.isEmpty()){
            int[] answer=new int[1];
            Arrays.fill(answer,-1);
            return answer;
        }else{
            int[] answer=new int[list.get(list.size()-1)-list.get(0)+1];
            for(int j=list.get(0),i=0;j<=list.get(list.size()-1);j++){
                answer[i++]=arr[j];
            }
            return answer;
        }
    }
}
