// 입력
// 1. 수의 개수 N
// 2. N개의 수 : 공백을 통한 구분

// 출력
// 주어진 수 중 소수의 개수 출력

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str);

        int answer = 0;

        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            if(isPrime(arr[i])) {
                answer++;
            }
        }


        bw.write(answer + ("\n"));

        bw.flush();
        bw.close();
        br.close();
    }

    public static boolean isPrime(int num) {
        if(num < 2) {
            return false;
        }

        for(int i = 2; i < num-1; i++) {
            if(num % i == 0) {
                return false;
            }
        }
        return true;
    }

}