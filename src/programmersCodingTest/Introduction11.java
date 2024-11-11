package programmersCodingTest;

import java.util.HashMap;
import java.util.Map;

public class Introduction11 {
//최빈값은 주어진 값 중에서 가장 자주 나오는 값을 의미합니다. 정수 배열 array가 매개변수로 주어질 때, 최빈값을 return 하도록 solution 함수를 완성해보세요. 최빈값이 여러 개면 -1을 return 합니다.


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solution(new int[] {1,1,2,2});
	}
	
	//내풀이
    public static int solution(int[] array) {
        Map<Integer,Integer> map=new HashMap<Integer,Integer>();
        for(int i=0;i<array.length;i++){
        	map.put(array[i], map.getOrDefault(array[i], 0)+1);
        }
        int max=0;
        int maxKey=-1;
        boolean flag=false;
        for(Map.Entry<Integer,Integer> m:map.entrySet()){
            if(m.getValue()>max) {
            	flag=false;
            	maxKey=m.getKey();
            	max=m.getValue();
            }else if(m.getValue()==max) {
            	flag=true;
            	maxKey=m.getKey();
            }
        }
        if(flag) {
        	return -1;
        }else {
        	return maxKey;
        }
    }
    //다른풀이
    public int solution2(int[] array) {
        int maxCount = 0;
        int answer = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int number : array){
            int count = map.getOrDefault(number, 0) + 1;
            if(count > maxCount){
                maxCount = count;
                answer = number;
            }
            else  if(count == maxCount){
                answer = -1;
            }
            map.put(number, count);
        }
        return answer;
    }
}
