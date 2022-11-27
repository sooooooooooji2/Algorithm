package com.example.algorithm.chapter2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main3 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");

        int index = 0;
        int[] arrA = new int[N];
        int[] arrB = new int[N];

        //1.A배열 담기
        while(st.hasMoreTokens()) {
            arrA[index] = Integer.parseInt(st.nextToken());
            index++;
        }

        //2.index 초기화
        index = 0;

        //3.B배열 담기
        while(st2.hasMoreTokens()) {
            arrB[index] = Integer.parseInt(st2.nextToken());
            index++;
        }

        //4.for구문 돌리기
        for(int j = 0 ; j < N; j++) {
            if(arrA[j] == 1) {
                if(arrB[j] == 1) sb.append("D"+'\n');
                else if(arrB[j] == 2) sb.append("B"+'\n');
                else if(arrB[j] == 3 ) sb.append("A"+'\n');
            }else if(arrA[j] == 2) {
                if(arrB[j] == 1) sb.append("A"+'\n');
                else if(arrB[j] == 2) sb.append("D"+'\n');
                else if(arrB[j] == 3 ) sb.append("B"+'\n');
            }else if(arrA[j] == 3) {
                if(arrB[j] == 1) sb.append("B"+'\n');
                else if(arrB[j] == 2) sb.append("A"+'\n');
                else if(arrB[j] == 3 ) sb.append("D"+'\n');
            }
        }

        //5.출력
        System.out.println(sb.toString());
    }

}

//[문제]
//A, B 두 사람이 가위바위보 게임을 합니다. 총 N번의 게임을 하여 A가 이기면 A를 출력하고,
//B가 이기면 B를 출력합니다. 비길 경우에는 D를 출력합니다.
//가위, 바위, 보의 정보는 1:가위, 2:바위, 3:보로 정하겠습니다.
//예를 들어 N=5이면 두 사람의 각 회의 가위, 바위, 보 정보가 주어지면 각 회를 누가 이겼는지 출력하는 프로그램
//을 작성하세요

//[입력]
//첫 번째 줄에 게임 횟수인 자연수 N(1<=N<=100)이 주어집니다.
//두 번째 줄에는 A가 낸 가위, 바위, 보 정보가 N개 주어집니다.
//세 번째 줄에는 B가 낸 가위, 바위, 보 정보가 N개 주어집니다.
//5
//2 3 3 1 3
//1 1 2 2 3
//
//[출력]
//각 줄에 각 회의 승자를 출력합니다. 비겼을 경우는 D를 출력합니다.
//A
//B
//A
//B
//D
