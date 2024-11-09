package programmersCodingTest;


public class Introduction7 {
//	첫 번째 분수의 분자와 분모를 뜻하는 numer1, denom1, 두 번째 분수의 분자와 분모를 뜻하는 numer2, denom2가 매개변수로 주어집니다. 두 분수를 더한 값을 기약 분수로 나타냈을 때 분자와 분모를 순서대로 담은 배열을 return 하도록 solution 함수를 완성해보세요.


	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	//내풀이
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        int a=numer1*denom2+denom1*numer2;
        int b=denom1*denom2;
        int cnt=b;
        
        while(cnt>=2){
            if(a%cnt==0&&b%cnt==0){
                a/=cnt;
                b/=cnt;
            }
            cnt--;
        }
        answer[0]=a;
        answer[1]=b;
        return answer;
    }
    //다른풀이
    public int[] solution2(int denum1, int num1, int denum2, int num2) {
        int denum = denum1 * num2 + denum2 * num1;
        int num = num1 * num2;

        int gcd = getGCD(denum, num);


        return new int[]{denum / gcd, num / gcd};
    }

    public int getGCD(int a, int b) {
        if (a % b == 0) {
            return b;
        }

        return getGCD(b, a%b);
    }
}
