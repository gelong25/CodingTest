// 입력
// 1. 명령어의 수 N
// 2. N개의 줄에 명령 : 한 줄에 하나씩

// 명령
/*
push X : 정수 X를 큐에 넣는 연산
pop : 큐에서 가장 앞에 있는 정수를 빼고 그 수를 출력 / 들어있는 정수가 없으면 -1 출력
size : 큐에 들어있는 정수의 개수 출력
empty : 큐가 비어있으면 1, 아니면 0 출력
front : 큐의 가장 앞에 있는 정수 출력 / 들어있는 정수가 없으면 -1 출력
back : 큐의 가장 뒤에 있는 정수 출력 / 들어있는 정수가 없으면 -1 출력
*/

// 출력
// 출력 명령이 주어지면 한 줄에 하나씩 출력

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Queue<Integer> queue = new LinkedList<>();
        int lastElement = -1;

        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i < n; i++) {
            String command = br.readLine();

            if(command.startsWith("push")) {
                int num = Integer.parseInt(command.split(" ")[1]);
                queue.add(num);
                lastElement = num;
            } else if(command.equals("pop")) {
                if(queue.isEmpty()) {
                    bw.write("-1\n");
                } else {
                    if(queue.size() == 1) {
                        lastElement = -1;
                    }
                    bw.write(queue.poll() + "\n");
                }
            } else if(command.equals("size")) {
                bw.write(queue.size() + "\n");
            } else if(command.equals("empty")) {
                if(queue.isEmpty()) {
                    bw.write("1\n");
                } else {
                    bw.write("0\n");
                }
            } else if(command.equals("front")) {
                if(queue.isEmpty()) {
                    bw.write("-1\n");
                } else {
                    bw.write(queue.peek() + "\n");
                }
            } else if(command.equals("back")) {
                if(queue.isEmpty()) {
                    bw.write("-1\n");
                } else {
                    bw.write(lastElement + "\n");
                }
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}