package programmersCodingTest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Introduction48 {
//소인수분해란 어떤 수를 소수들의 곱으로 표현하는 것입니다. 예를 들어 12를 소인수 분해하면 2 * 2 * 3 으로 나타낼 수 있습니다. 따라서 12의 소인수는 2와 3입니다. 자연수 n이 매개변수로 주어질 때 n의 소인수를 오름차순으로 담은 배열을 return하도록 solution 함수를 완성해주세요.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	//내풀이
    public int[] solution(int n) {
        List<Integer> list=new ArrayList<Integer>();
        Map<Integer,Integer> map=new HashMap<Integer,Integer>();
        makeDecimal(n,map);
        for(Map.Entry m:map.entrySet()){
            list.add((Integer) m.getKey());
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
    
    public void makeDecimal(int n,Map map){
        int divisor=n-1;
        while(divisor>1){
            if(n%divisor==0){
                n/=divisor;
                makeDecimal(divisor,map);
                divisor=n;
            }
            divisor--;
        }
        map.put(n,n);
    }
}
