//합리적 소비 
import java.io.*;
import java.util.*; 
class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
        
        //첫째줄 입력 
        String[] firstInput = br.readLine().split(" ");
        int N = Integer.parseInt(firstInput[0]);
        int B = Integer.parseInt(firstInput[1]); 

        //둘째줄 입력 
        String[] secInput = br.readLine().split(" ");
        int[] price = new int[N];

        //정수로 변환 후 배열에 저장 
        for(int i = 0; i < N; i++) {
            price[i] = Integer.parseInt(secInput[i]); 
        }

        //오름차순 정렬 
        Arrays.sort(price);

        int cnt = 0; 
        int totalCost = 0; 
        
        for(int i = 0; i < N; i++) {
            if(totalCost > B) {
                break;
            }
            totalCost += price[i];
            cnt++; 
        }

        System.out.println(cnt); 


	}
}
