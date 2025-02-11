// 입력
// 1. 명령의 수 N
// 2. N개의 줄에 명령

// 명령
// push X : 정수 X를 스택에 넣음
// pop : 스택 가장 위의 정수를 빼고 그 수를 출력 / 스택에 정수가 없으면 -1 출력
// size : 스택에 들어있는 정수의 개수 출력
// empty : 스택이 비어 있으면 1 / 아니면 0 출력
// top : 스택의 가장 위에 있는 정수 출력 / 스택에 정수가 없으면 -1 출력

// 출력
// 한 줄에 하나씩 명령 결과 출력

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Stack<Integer> stack = new Stack<>();

        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i < n; i++) {
            String command = br.readLine();

            if(command.startsWith("push")) {
                int num = Integer.parseInt(command.split(" ")[1]);
                stack.push(num);
            } else if(command.equals("pop")) {
                if(stack.isEmpty()) {
                    bw.write("-1\n");
                } else {
                    bw.write(stack.pop() + "\n");
                }
            } else if(command.equals("size")) {
                bw.write(stack.size() + "\n");
            } else if(command.equals("empty")) {
                bw.write((stack.isEmpty() ? "1" : "0")+ "\n");
            } else if(command.equals("top")) {
                if(stack.isEmpty()) {
                    bw.write("-1\n");
                } else {
                    bw.write(stack.peek() + "\n");
                }
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }

}