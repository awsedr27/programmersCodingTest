package programmersCodingTest;

import java.math.BigInteger;

public class Introduction36 {
//머쓱이는 구슬을 친구들에게 나누어주려고 합니다. 구슬은 모두 다르게 생겼습니다. 머쓱이가 갖고 있는 구슬의 개수 balls와 친구들에게 나누어 줄 구슬 개수 share이 매개변수로 주어질 때, balls개의 구슬 중 share개의 구슬을 고르는 가능한 모든 경우의 수를 return 하는 solution 함수를 완성해주세요.


	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	//내풀이
    public int solution(int balls, int share) {
    	int answer=0;
        BigInteger a=factorial(balls);
        BigInteger b=factorial(share);
        BigInteger ab=factorial(balls-share);
        answer=a.divide(b.multiply(ab)).intValue();
        return answer;
    }
    public BigInteger factorial(int n){
    	BigInteger r= new BigInteger("1");
    	
        for(int i=1;i<=n;i++){
            r=r.multiply(new BigInteger(String.valueOf(i)));
        }
        return r;
    }
    
    //다른풀이
    
    public long solution2(int balls, int share) {
        share = Math.min(balls - share, share);

        if (share == 0)
            return 1;

        long result = solution(balls - 1, share - 1);
        result *= balls;
        result /= share;

        return result;
    }
    
    //다룬풀이
    public long solution3(int n, int r) {
        return combination(n, r);
    }

    // The useful principle of combination : nCr = n-1Cr + n-1Cr-1
    static long combination(int n, int r) {
        if(n == r) return 1;
        if(r==1 || n-r == 1) return n;

        long temp = combination(n-1, r);

        return temp + (temp * r) / (n-r);
    }
}
