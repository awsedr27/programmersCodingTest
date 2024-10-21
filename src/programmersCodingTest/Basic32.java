package programmersCodingTest;

import java.util.ArrayList;
import java.util.List;

//정수 l과 r이 주어졌을 때, l 이상 r이하의 정수 중에서 숫자 "0"과 "5"로만 이루어진 모든 정수를 오름차순으로 저장한 배열을 return 하는 solution 함수를 완성해 주세요.
//
//만약 그러한 정수가 없다면, -1이 담긴 배열을 return 합니다.

public class Basic32 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	//내풀이
    public int[] solution(int l, int r) {
        List<Integer> list=new ArrayList();
        for(;l<=r;l++){
            String value=String.valueOf(l);
            boolean flag=true;
            for(char a:value.toCharArray()){
                if(a!='5'&&a!='0'){
                    flag=false;
                    break;
                }
            }
            if(flag){
                list.add(l);
            }
        }
        if(list.isEmpty()) {
        	list.add(-1);
        }
        
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
    //다른풀이
    public int[] solution2(int l, int r) {

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 1; i < 64; i++) {
            int num = Integer.parseInt(Integer.toBinaryString(i)) * 5;
            if (l <= num && num <= r)
                list.add(num);
        }

        return list.isEmpty() ? new int[] { -1 } : list.stream().mapToInt(i -> i).toArray();
    }
    


}
