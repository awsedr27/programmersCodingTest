package programmersCodingTest;


public class Introduction62 {
//정수 배열 array가 매개변수로 주어질 때, 가장 큰 수와 그 수의 인덱스를 담은 배열을 return 하도록 solution 함수를 완성해보세요.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	//내풀이
    public int[] solution(int[] array) {
        int[] answer = new int[2];
        for(int i=0;i<array.length;i++){
            if(answer[0]<array[i]){
                answer[0]=array[i];
                answer[1]=i;
            }
        }
        
        return answer;
    }
}
