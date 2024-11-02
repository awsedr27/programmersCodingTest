package programmersCodingTest;

import java.util.Arrays;

public class Basic98 {
//문자열 배열 strArr이 주어집니다. strArr의 원소들을 길이가 같은 문자열들끼리 그룹으로 묶었을 때 가장 개수가 많은 그룹의 크기를 return 하는 solution 함수를 완성해 주세요.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	//내풀이
    public int solution(String[] strArr) {
        int answer = 0;
        int[] count=new int[30];
        for(String str:strArr){
            count[str.length()-1]++;
        }
        Arrays.sort(count);
        
        return count[29];
    }
    
}
