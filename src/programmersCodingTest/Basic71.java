package programmersCodingTest;

import java.util.ArrayList;
import java.util.List;

//정수 배열 arr가 주어집니다. arr의 각 원소에 대해 값이 50보다 크거나 같은 짝수라면 2로 나누고, 50보다 작은 홀수라면 2를 곱합니다. 그 결과인 정수 배열을 return 하는 solution 함수를 완성해 주세요.
public class Basic71 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	//내풀이
    public int[] solution(int[] arr) {
        
        List<Integer> list=new ArrayList<Integer>();
        for(int i:arr){
            if(i>=50&&i%2==0){
                list.add(i/2);
            }else if(i<50&&i%2!=0){
                list.add(i*2);
            }else{
                list.add(i);
            }
        }
        int[] answer = new int[list.size()];
        for(int i=0;i<list.size();i++){
            answer[i]=list.get(i);
        }
        
        return answer;
    }
}
