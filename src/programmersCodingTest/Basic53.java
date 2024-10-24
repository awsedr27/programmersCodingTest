package programmersCodingTest;
//문자열 my_string과 정수 배열 indices가 주어질 때, my_string에서 indices의 원소에 해당하는 인덱스의 글자를 지우고 이어 붙인 문자열을 return 하는 solution 함수를 작성해 주세요.
public class Basic53 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a={1, 16, 6, 15, 0, 10, 11, 3};
		solution("apporoograpemmemprs",a);
	}
	//내풀이
    public static String solution(String my_string, int[] indices) {
        StringBuilder sb=new StringBuilder(my_string);
        for(int i=0;i<indices.length;i++){
            sb.deleteCharAt(indices[i]);
            for(int j=i+1;j<indices.length;j++){
                if(indices[i]<indices[j]){
                    indices[j]--;
                }
            }
        }
        return sb.toString();
    }
    //다른풀이
    public String solution2(String my_string, int[] indices) {
        String answer = "";
        String[] tmp = my_string.split("");

        for (int i = 0; i < indices.length; i++) {
            tmp[indices[i]] = "";
        }

        for (String x : tmp) {
            answer += x;
        }
        return answer;
    }
}
