package programmersCodingTest;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Introduction90 {
//영어 점수와 수학 점수의 평균 점수를 기준으로 학생들의 등수를 매기려고 합니다. 영어 점수와 수학 점수를 담은 2차원 정수 배열 score가 주어질 때, 영어 점수와 수학 점수의 평균을 기준으로 매긴 등수를 담은 배열을 return하도록 solution 함수를 완성해주세요.
	public static void main(String[] args) {
		solution(new int[][] {{80,70},{70,80},{30,50},{90,100},{100,90},{100,100},{10,30}});
	}
	//내풀이
    public static int[] solution(int[][] score) {
        int[] answer = new int[score.length];
        Map<Integer,Integer> map=new HashMap<Integer,Integer>();
        
        for(int i=0;i<score.length;i++){
            int sum=0;
            for(int j=0;j<score[i].length;j++){
                sum+=score[i][j];
            }
            map.put(i,sum);
        }
        List<Entry<Integer, Integer>> list=new ArrayList<>(map.entrySet());
        
        list.sort((o1, o2) ->o2.getValue().compareTo(o1.getValue()));
        int cnt=0;
        int prev=-1;
        for(int i=0;i<list.size();i++) {
        	if(prev==list.get(i).getValue()) {
        		answer[list.get(i).getKey()]=cnt;
        	}else {
        		answer[list.get(i).getKey()]=i+1;
        		cnt=i+1;
        		prev=list.get(i).getValue();
        	}
        }
        return answer;
    }
    
    //다른풀이
    public static int[] solution2(int[][] score) {
    	int[] answer = new int[score.length];
    	List<Integer> list=new ArrayList<Integer>();
    	for(int i=0;i<score.length;i++) {
    		list.add(score[i][0]+score[i][1]);
    	}
    	list.sort(Comparator.reverseOrder());
    	for(int i=0;i<answer.length;i++) {
    		answer[i]=list.indexOf(score[i][0]+score[i][1])+1;
    	}
    	return answer;
    }
    
}
