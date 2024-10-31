package programmersCodingTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Basic86 {
//문자열 myString이 주어집니다. myString을 문자 "x"를 기준으로 나눴을 때 나눠진 문자열 각각의 길이를 순서대로 저장한 배열을 return 하는 solution 함수를 완성해 주세요.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	//내풀이
    public int[] solution(String myString) {
        List<Integer> list=new ArrayList<Integer>();
        int cnt=0;
        for(int i=0;i<myString.length();i++){
            if(myString.charAt(i)!='x'){
                cnt++;
                continue;
            }else{
                list.add(cnt);
                cnt=0;
                continue;
            }
        }
        list.add(cnt);
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
    //다른풀이
    public int[] solution2(String myString) {

        return Arrays.stream(myString.split("x", myString.length()))
            .mapToInt(x -> x.length())
            .toArray();
    }
    
}
