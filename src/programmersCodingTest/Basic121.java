package programmersCodingTest;


public class Basic121 {
//	양의 정수 n이 매개변수로 주어집니다. n × n 배열에 1부터 n2 까지 정수를 인덱스 [0][0]부터 시계방향 나선형으로 배치한 이차원 배열을 return 하는 solution 함수를 작성해 주세요.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solution(4);
	}
	//내풀이
    public static int[][] solution(int n) {
        int[][] answer = new int[n][n];
        int k=1;
        int j=0;
        int idx=1;
        while(idx<=n*n){
            j=(k-1)/4;
            if(k%4==1){
                for(int i=j;i<n-j;i++){
                	if(answer[j][i]!=0) {
                		continue;
                	}
                		answer[j][i]=idx++;

                }
            }else if(k%4==2){
                for(int i=j;i<n-j;i++){
                	if(answer[i][n-1-j]!=0) {
                		continue;
                	}
                		answer[i][n-1-j]=idx++;

                }
            }else if(k%4==3){
                for(int i=n-1-j;i>j;i--){
                	if(answer[n-j-1][i]!=0) {
                		continue;
                	}
                		answer[n-j-1][i]=idx++;

                }
            }else if(k%4==0){
                for(int i=n-1-j;i>j;i--){
                	if(answer[i][j]!=0) {
                		continue;
                	}
                		answer[i][j]=idx++;
                }
            }
            k++;
        }
        return answer;
    }
    //다른풀이
    public int[][] solution2(int n) {
        int[][] answer = new int[n][n];
        int num = 1;
        int x = 0, y = 0;
        int dx[] = {0, 1, 0, -1};
        int dy[] = {1, 0, -1, 0};
        int direction = 0;

        while (num <= n * n) {
            answer[x][y] = num++;

            int nx = x + dx[direction]; 
            int ny = y + dy[direction];

            if (nx < 0 || nx >= n || ny < 0 || ny >= n || answer[nx][ny] != 0) {
                direction = (direction + 1) % 4; //범위 밖에 나갔을 때 방향전환
                nx = x + dx[direction];
                ny = y + dy[direction];
            }
            x = nx;
            y = ny;
        }

        return answer;
    }
    //다른풀이
    public int[][] solution3(int n) {
        int[][] answer = new int[n][n];
        int num=1;
        int start=0;
        int end=n;

        while(num <= n*n){

        //->
        for(int j=start;j<end;j++)
            answer[start][j]=num++;
        //v
        for(int i=start+1;i<end;i++)
            answer[i][end-1]=num++;
        //<
        for(int j=end-2;j>=start;j--)
            answer[end-1][j]=num++;
        //^
        for(int i=end-2;i>start;i--)
            answer[i][start]=num++;
        start++;
        end--;

        }

        return answer;
    }
    
}
