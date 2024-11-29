package programmersCodingTest;


public class Introduction77 {
//2차원 좌표 평면에 변이 축과 평행한 직사각형이 있습니다. 직사각형 네 꼭짓점의 좌표 [[x1, y1], [x2, y2], [x3, y3], [x4, y4]]가 담겨있는 배열 dots가 매개변수로 주어질 때, 직사각형의 넓이를 return 하도록 solution 함수를 완성해보세요.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	//내풀이
    public int solution(int[][] dots) {
        int answer = 1;
        int x=dots[0][0];
        int y=dots[0][1];
        for(int i=1;i<dots.length;i++){
            if(x==dots[i][0]){
                answer*=(y-dots[i][1]);
            }
            if(y==dots[i][1]){
                answer*=(x-dots[i][0]);
            }
        }
        return Math.abs(answer);
    }
	
}
