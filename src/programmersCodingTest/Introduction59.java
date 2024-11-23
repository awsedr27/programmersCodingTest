package programmersCodingTest;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class Introduction59 {
//문자열 s가 매개변수로 주어집니다. s에서 한 번만 등장하는 문자를 사전 순으로 정렬한 문자열을 return 하도록 solution 함수를 완성해보세요. 한 번만 등장하는 문자가 없을 경우 빈 문자열을 return 합니다.


	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	//내풀이
    public String solution(String s) {
        StringBuilder sb=new StringBuilder();
        String[] arr=s.split("");
        Arrays.sort(arr);
        for(String text:arr){
            if(s.lastIndexOf(text)==s.indexOf(text)){
                sb.append(text);
            }
        }
        
        return sb.toString();
    }
    //
    public String solution2(String s) {
        return Arrays.stream(s.split(""))
                .collect(Collectors.groupingBy(s1 -> s1))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue().size() <= 1)
                .map(Map.Entry::getKey)
                .sorted()
                .collect(Collectors.joining());
    }
}
