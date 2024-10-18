package programmersCodingTest;

public class Basic21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	//내풀이
    public String solution(String code) {
        String answer = "";
        boolean mode=false;
        char[] codeArray=code.toCharArray();
        String ret="";
        for(int idx=0;idx<code.length();idx++){
            if(mode){
                //1일때
                if(codeArray[idx]=='1'){
                    mode=!mode;
                }else{
                    if(idx%2!=0){
                        ret+=codeArray[idx];
                    }
                }
            }else{
                //0일때
                if(codeArray[idx]=='1'){
                    mode=!mode;
                }else{
                    if(idx%2==0){
                        ret+=codeArray[idx];
                    }
                }
            }
        }
	    if(ret.equals("")){
	        answer="EMPTY";
	    }else{
	        answer=ret;
	    }
	        return answer;
	}


//다른풀이
	public String solution2(String code) {
	    StringBuilder answer = new StringBuilder();
	    int mode = 0;
	    for (int i = 0; i < code.length(); i++) {
	        char current = code.charAt(i);
	        if (current == '1') {
	            mode = mode == 0 ? 1 : 0;
	            continue;
	        }
	
	        if (i % 2 == mode) {
	            answer.append(current);
	        }
	    }
	    return answer.length() == 0 ? "EMPTY" : answer.toString();
	}
}
