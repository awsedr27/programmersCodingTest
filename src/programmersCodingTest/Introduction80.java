package programmersCodingTest;


public class Introduction80 {
//한 개 이상의 항의 합으로 이루어진 식을 다항식이라고 합니다. 다항식을 계산할 때는 동류항끼리 계산해 정리합니다. 덧셈으로 이루어진 다항식 polynomial이 매개변수로 주어질 때, 동류항끼리 더한 결괏값을 문자열로 return 하도록 solution 함수를 완성해보세요. 같은 식이라면 가장 짧은 수식을 return 합니다.


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(solution("x"));
	}
	//내풀이
    public static String solution(String polynomial) {
        int coe=0;
        int con=0;
        for(String s:polynomial.split(" ")){
            if(s.contains("x")){
                if(s.indexOf("x")==0){
                    coe+=1;
                }else{
                    coe+=Integer.parseInt(s.replace("x",""));
                }
                
            }else if(s.contains("+")){
                continue;
            }else{
                con+=Integer.parseInt(s);
            }
        }
        return (coe==0?"":coe==1?"x":coe+"x")+(coe!=0&&con!=0?" + ":"")+(con==0?"":con);
    }
}
