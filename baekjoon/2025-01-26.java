// 입력
// 두 수 A, B : 공백

// 출력
// 1. A, B 사이에 있는 수의 개수 출력
// 2. A, B 두 수 사이의 수 : 오름차순 정렬

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 정수 입력 받기
        int a = sc.nextInt();
        int b = sc.nextInt();

        int max = Math.max(a, b);
        int min = Math.min(a, b);

        // 두 수 사이의 정수 개수 출력
        int count = max - min - 1;
        System.out.println(count);

        // 두 수 사이ㅢ 정수 출력
        for(int i = min + 1; i < max; i++) {
            System.out.print(i + " ");
        }
    }
}
