package programmersCodingTest;


public class Introduction97 {



	public static void main(String[] args) {
		solution("hello", "ohell");
	}
	//내풀이
    public static int solution(String A, String B) {
        int answer = 0;
        for(int i=0;i<A.length();i++){
        	if(A.equals(B)) {
        		return i;
        	}
        	char[] c=A.toCharArray();
        	A=c[A.length()-1]+"";
        	for(int j=0;j<c.length-1;j++) {
        		A+=c[j];
        	}
        }
        return -1;
    }
}
