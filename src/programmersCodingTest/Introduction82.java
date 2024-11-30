package programmersCodingTest;


public class Introduction82 {

//다음 그림과 같이 지뢰가 있는 지역과 지뢰에 인접한 위, 아래, 좌, 우 대각선 칸을 모두 위험지역으로 분류합니다.
//	지뢰는 2차원 배열 board에 1로 표시되어 있고 board에는 지뢰가 매설 된 지역 1과, 지뢰가 없는 지역 0만 존재합니다.
//	지뢰가 매설된 지역의 지도 board가 매개변수로 주어질 때, 안전한 지역의 칸 수를 return하도록 solution 함수를 완성해주세요.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solution(new int[][] 	{{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 1, 0, 0}, {0, 0, 0, 0, 0}});
	}
	//내풀이
    public static int solution(int[][] board) {
        int answer = 0;
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[i].length;j++){
                if(board[i][j]==1){
                    if(i-1>=0){
                    	if(j-1>=0) {
                    		board[i-1][j-1]=board[i-1][j-1]!=1?3:board[i-1][j-1];
                    	}
                    	if(j+1<board[i-1].length) {
                    		board[i-1][j+1]=board[i-1][j+1]!=1?3:board[i-1][j+1];
                    	}
                    	board[i-1][j]=board[i-1][j]!=1?3:board[i-1][j];
                    }
                    
                    if(i+1<board.length) {
                      	if(j-1>=0) {
                    		board[i+1][j-1]=board[i+1][j-1]!=1?3:board[i+1][j-1];
                    	}
                    	if(j+1<board[i+1].length) {
                    		board[i+1][j+1]=board[i+1][j+1]!=1?3:board[i+1][j+1];
                    	}
                    	board[i+1][j]=board[i+1][j]!=1?3:board[i+1][j];
                    }
                    
                    if(j+1<board[i].length) {
                    	board[i][j+1]=board[i][j+1]!=1?3:board[i][j+1];
                    }
                    
                    if(j-1>=0) {
                    	board[i][j-1]=board[i][j-1]!=1?3:board[i][j-1];
                    }
                }
            }
        }
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[i].length;j++){
            	if(board[i][j]==0) {
            		answer++;
            	}
            }
            
        }
        return answer;
    }
}
