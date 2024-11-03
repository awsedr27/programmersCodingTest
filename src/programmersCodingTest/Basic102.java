package programmersCodingTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Basic102 {
//0번부터 n - 1번까지 n명의 학생 중 3명을 선발하는 전국 대회 선발 고사를 보았습니다. 등수가 높은 3명을 선발해야 하지만, 개인 사정으로 전국 대회에 참여하지 못하는 학생들이 있어 참여가 가능한 학생 중 등수가 높은 3명을 선발하기로 했습니다.

//각 학생들의 선발 고사 등수를 담은 정수 배열 rank와 전국 대회 참여 가능 여부가 담긴 boolean 배열 attendance가 매개변수로 주어집니다. 전국 대회에 선발된 학생 번호들을 등수가 높은 순서대로 각각 a, b, c번이라고 할 때 10000 × a + 100 × b + c를 return 하는 solution 함수를 작성해 주세요.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	//내풀이
    public int solution(int[] rank, boolean[] attendance) {
        List<Integer> list=new ArrayList<Integer>();
        Map<Integer,Integer> map=new HashMap<Integer,Integer>();
        for(int i=0;i<rank.length;i++){
            if(attendance[i]){
                list.add(rank[i]);
                map.put(rank[i],i);
            }
        }
        Collections.sort(list);
        int a=list.get(0);
        int b=list.get(1);
        int c=list.get(2);
        
        return 10000*map.get(a)+100*map.get(b)+map.get(c);
    }
    //다른풀이
    public int solution2(int[] rank, boolean[] attendance) {
        int ans = 0, cnt = 0, r = 1;
        int[] abc = new int[3];
        HashMap<Integer,Integer> m = new HashMap<>();
        for(int i=0 ; i<rank.length ; i++)
            m.put(rank[i],i);
        while(cnt<3){
            if(attendance[m.get(r)])
                abc[cnt++] = m.get(r);
            r++;
        }
        return abc[0]*10000 + abc[1]*100 + abc[2];
    }
    
}
