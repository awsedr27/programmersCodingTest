package programmersCodingTest;


public class Introduction57 {
//영어가 싫은 머쓱이는 영어로 표기되어있는 숫자를 수로 바꾸려고 합니다. 문자열 numbers가 매개변수로 주어질 때, numbers를 정수로 바꿔 return 하도록 solution 함수를 완성해 주세요.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	//내풀이
    public long solution(String numbers) {
        long answer = 0;
        String text="";
        for(char c: numbers.toCharArray()){
            text+=String.valueOf(c);
            if("zero".equals(text)){
                answer*=10;
                answer+=0;
                text="";
            }else if("one".equals(text)){
                answer*=10;
                answer+=1;
                text="";
            }else if("two".equals(text)){
                answer*=10;
                answer+=2;
                text="";
            }else if("three".equals(text)){
                answer*=10;
                answer+=3;
                text="";
            }else if("four".equals(text)){
                answer*=10;
                answer+=4;
                text="";
            }else if("five".equals(text)){
                answer*=10;
                answer+=5;
                text="";
            }else if("six".equals(text)){
                answer*=10;
                answer+=6;
                text="";
            }else if("seven".equals(text)){
                answer*=10;
                answer+=7;
                text="";
            }else if("eight".equals(text)){
                answer*=10;
                answer+=8;
                text="";
            }else if("nine".equals(text)){
                answer*=10;
                answer+=9;
                text="";
            }
        }
        
        return answer;
    }
    //다른풀이
    public long solution2(String numbers) {

        String[] numbers_arr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        for (int i = 0; i < numbers_arr.length; i++) {
            numbers = numbers.replaceAll(numbers_arr[i], String.valueOf(i));
        }

        long answer = Long.parseLong(numbers);
        return answer;
    }
}
