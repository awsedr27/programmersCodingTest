package programmersCodingTest;

import java.util.HashMap;
import java.util.Map;

public class Introduction87 {
//선분 3개가 평행하게 놓여 있습니다. 세 선분의 시작과 끝 좌표가 [[start, end], [start, end], [start, end]] 형태로 들어있는 2차원 배열 lines가 매개변수로 주어질 때, 두 개 이상의 선분이 겹치는 부분의 길이를 return 하도록 solution 함수를 완성해보세요.
//lines가 [[0, 2], [-3, -1], [-2, 1]]일 때 그림으로 나타내면 다음과 같습니다.
//선분이 두 개 이상 겹친 곳은 [-2, -1], [0, 1]로 길이 2만큼 겹쳐있습니다.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solution(new int[][] {{-1,1},{1,3},{3,9}});
	}
	//내풀이
    public static int solution(int[][] lines) {
        int answer = 0;
        int max=-101;
        int min=101;
        for(int i=0;i<lines.length;i++){
            for(int k:lines[i]){
                if(max<=k){
                    max=k;
                }
                if(min>=k){
                    min=k;
                }
            }
        }
        int cnt=0;
        for(int j=min;j<=max;j++){
            if(lines[0][0]<=j&&j<lines[0][1]){
                cnt++;
            }
            if(lines[1][0]<=j&&j<lines[1][1]){
                cnt++;
            }
            if(lines[2][0]<=j&&j<lines[2][1]){
                cnt++;
            }
            if(cnt>=2){
                answer++;
            }
            cnt=0;
        }
        return answer==0?0:answer;
    }
}
