// 입력
// 1. 수의 개수 N
// 2. N개의 줄에 수

// 출력
// N개의 줄에 오름차순으로 정렬한 결과
// 한 줄에 하나씩 출력

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 입력
        int n = Integer.parseInt(br.readLine());

        int[] nums = new int[n];
        for(int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(br.readLine());
        }

        // 정렬
        Arrays.sort(nums);

        // 출력
        for(int i = 0; i < n; i++) {
            bw.write(nums[i] + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}