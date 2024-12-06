package programmersCodingTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Introduction89 {
//정수 n을 기준으로 n과 가까운 수부터 정렬하려고 합니다. 이때 n으로부터의 거리가 같다면 더 큰 수를 앞에 오도록 배치합니다. 정수가 담긴 배열 numlist와 정수 n이 주어질 때 numlist의 원소를 n으로부터 가까운 순서대로 정렬한 배열을 return하도록 solution 함수를 완성해주세요.
	public static void main(String[] args) {
		solution(new int[] {1,2,3,4,5,6},4);
	}
	//내풀이
    public static int[] solution(int[] numlist, int n) {
        int[] answer = new int[numlist.length];
        Arrays.sort(numlist);
        int index=0;
        int a=numlist[0];
        for(int i=1;i<numlist.length;i++){
            if(Math.abs(a-n)>=Math.abs(numlist[i]-n)) {
            	a=numlist[i];
            	index=i;
            }
        }
        int plusPointer=index+1;
        int miusPointer=index-1;
        answer[0]=a;
        for(int i=1;i<answer.length;i++) {
        	if(plusPointer<answer.length&&miusPointer>=0) {
        		answer[i]=Math.abs(n-numlist[plusPointer])>Math.abs(n-numlist[miusPointer])?numlist[miusPointer--]:numlist[plusPointer++];
        	}else {
                if(plusPointer>=answer.length) {
                	answer[i]=numlist[miusPointer--];
                	continue;
                }
                if(miusPointer<0) {
                	answer[i]=numlist[plusPointer++];
                	continue;
                }
        	}
        }

        return answer;
    }
    //다른풀이
    public static int[] solution2(int[] numlist, int n) {
    	int[] answer = new int[numlist.length];
    	List<Integer> list=new ArrayList<Integer>();
    	for(int i:numlist) {
    		list.add(i);
    	}
    	Collections.sort(list, new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
    			if(Math.abs(o1-n)==Math.abs(o2-n)) {
    				return Integer.compare(o2, o1);
    			}
    			return Integer.compare(Math.abs(o1-n), Math.abs(o2-n));

			};
		});
    	
    	for(int i=0;i<answer.length;i++) {
    		answer[i]=list.get(i);
    	}
    	return answer;
    }

    
    
}
