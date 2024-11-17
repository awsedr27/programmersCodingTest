package programmersCodingTest;


public class Introduction34 {
//머쓱이는 친구에게 모스부호를 이용한 편지를 받았습니다. 그냥은 읽을 수 없어 이를 해독하는 프로그램을 만들려고 합니다. 문자열 letter가 매개변수로 주어질 때, letter를 영어 소문자로 바꾼 문자열을 return 하도록 solution 함수를 완성해보세요.
//	모스부호는 다음과 같습니다.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	//내풀이
    public String solution(String letter) {
        String answer = "";
        for(String a:letter.split(" ")){
            if(a.equals(".-")){
                answer+="a";
            }else if(a.equals("-...")){
                answer+="b";
            }else if(a.equals("-.-.")){
                answer+="c";
            }else if(a.equals("-..")){
                answer+="d";
            }else if(a.equals(".")){
                answer+="e";
            }else if(a.equals("..-.")){
                answer+="f";
            }else if(a.equals("--.")){
                answer+="g";
            }else if(a.equals("....")){
                answer+="h";
            }else if(a.equals("..")){
                answer+="i";
            }else if(a.equals(".---")){
                answer+="j";
            }else if(a.equals("-.-")){
                answer+="k";
            }else if(a.equals(".-..")){
                answer+="l";
            }else if(a.equals("--")){
                answer+="m";
            }else if(a.equals("-.")){
                answer+="n";
            }else if(a.equals("---")){
                answer+="o";
            }else if(a.equals(".--.")){
                answer+="p";
            }else if(a.equals("--.-")){
                answer+="q";
            }else if(a.equals(".-.")){
                answer+="r";
            }else if(a.equals("...")){
                answer+="s";
            }else if(a.equals("-")){
                answer+="t";
            }else if(a.equals("..-")){
                answer+="u";
            }else if(a.equals("...-")){
                answer+="v";
            }else if(a.equals(".--")){
                answer+="w";
            }else if(a.equals("-..-")){
                answer+="x";
            }else if(a.equals("-.--")){
                answer+="y";
            }else if(a.equals("--..")){
                answer+="z";
            }
        }
        return answer;
    }
}
