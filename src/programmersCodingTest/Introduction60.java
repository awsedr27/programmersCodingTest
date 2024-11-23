package programmersCodingTest;

import java.util.ArrayList;
import java.util.List;

public class Introduction60 {
//정수 n이 매개변수로 주어질 때, n의 약수를 오름차순으로 담은 배열을 return하도록 solution 함수를 완성해주세요.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	//내풀이
    public int[] solution(int n) {
        List<Integer> list=new ArrayList<Integer>();
        int cnt=1;
        while(n>=cnt){
            if(n%cnt==0){
                list.add(cnt);
            }
            cnt++;
        }
        return list.stream().mapToInt(i->i).toArray();
    }
}
