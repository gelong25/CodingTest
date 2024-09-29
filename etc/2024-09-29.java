//나무꾼 구름이 이분탐색 
//입력 
//1. 첫째 줄 : 두 정수 N, K가 공백을 두고 주어진다
//2. 둘째 줄 : K개의 이동 명령이 공백 없이 주어진다
//3. 그 다음 줄 : N개의 줄에 보드게임 상태를 나타내는 N개의 정수가 공백을 두고 주어진다 

//논리
//1-1. 0이면 통과 가능한 칸
//1-2. 1이면 출발 위치
//1-3. 2이면 탈출 위치 
//1-4. 3이면 통과 불가능한 벽 
//2. 2를 만나면 즉시 탈출 
//3.  이동은 L R U D로 주어짐
//3-1.벽을 만나면 해당 이동 명령 무시하고 다음 명령 수행 
//4.  탈출 위치에 도착하면 성공
//4-1.탈출 위치에 방문 못하면 실패 

//출력 
//미로 탈출 성공: SUCCESS와 실제 이동횟수를 공백을 두고 출력
//미로 탈출 실패: FAIL 출력 

import java.io.*;
import java.util.*; 
class Main {
	public static void main(String[] args) throws Exception {
		//입력 받기 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] firstInput = br.readLine().split(" ");
		int N = Integer.parseInt(firstInput[0]);
		int K = Integer.parseInt(firstInput[1]);
		
		String move = br.readLine(); 
		
		int[][] map = new int[N][N];
		for(int i = 0; i < N; i++) {
			String[] mapInput = br.readLine().split(" ");
			for(int j = 0; j < N; j++) {
				map[i][j] = Integer.parseInt(mapInput[j]);
			}
		}
		
		//초기 위치 : map 요소 중 1이 있는 위치 
		int x = -1;
	  int y = -1;
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				if(map[i][j] == 1) {
					x = i;
					y = j; 
				}
			}
		}
		
		int[] dx = {0, 0, -1, 1}; //행 이동 방향
		int[] dy = {-1, 1, 0, 0}; //열 이동 방향 
		
		char[] moveType = {'L', 'R', 'U', 'D'};
		
		int moveCnt = 0; 
		boolean success = false; 
		
		//이동 명령 수행 
		for(int i = 0; i < move.length(); i++) {
			char plan = move.charAt(i);
			
			int nx = x;
			int ny = y;
			
			for(int j = 0; j < 4; j++) {
				if(plan == moveType[j]) {
					nx = x + dx[j];
					ny = y + dy[j];
					break;
				}
			}
			
			//맵을 벗어나거나 벽을 만난 경우 
			if(nx < 0 || ny < 0 || nx >= N || ny >= N || map[nx][ny] == 3	) {
				continue;
			}
			
			//이동 성공 시 위치 업데이트 
			x = nx; 
			y = ny; 
			moveCnt++; 
			
			if(map[x][y] == 2) {
				success = true;
				break; 
			}
			
		}
		
		if(success) {
				System.out.println("SUCCESS " + moveCnt);
			} else {
				System.out.println("FAIL");
			}
		
	}
}
