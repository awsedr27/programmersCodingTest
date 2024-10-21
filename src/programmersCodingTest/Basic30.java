package programmersCodingTest;

import java.util.Arrays;

//정수 배열 arr와 2차원 정수 배열 queries이 주어집니다. queries의 원소는 각각 하나의 query를 나타내며, [s, e, k] 꼴입니다.
//
//각 query마다 순서대로 s ≤ i ≤ e인 모든 i에 대해 k보다 크면서 가장 작은 arr[i]를 찾습니다.
//
//각 쿼리의 순서에 맞게 답을 저장한 배열을 반환하는 solution 함수를 완성해 주세요.
//단, 특정 쿼리의 답이 존재하지 않으면 -1을 저장합니다.
public class Basic30 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	//내풀이
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        for(int j=0;j<queries.length;j++){
            int min=1000000;
            for(int i=queries[j][0];i<=queries[j][1];i++){
                if(queries[j][2]<arr[i]&&min>arr[i]){
                    min=arr[i];
                }
            }
            if(min==1000000){
                answer[j]=-1;
            }else{
                answer[j]=min;
            }
            
        }
        return answer;
    }
    
    //다른풀이
    public int[] solution2(int[] arr, int[][] queries) {
    	
        int[] answer = new int[queries.length];
        Arrays.fill(answer, -1);
        for (int idx = 0; idx < queries.length; idx++) {
            int[] query = queries[idx];
            int s = query[0], e = query[1], k = query[2];

            for (int i = s; i <= e; i++) {
                if (k < arr[i]) {
                    answer[idx] = answer[idx] == -1 ? arr[i] : Math.min(answer[idx], arr[i]);
                }
            }

        }

        return answer;
    }

}
