package com.example.algorithm.chapter2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int inputNum = Integer.parseInt(br.readLine()); // 자연수 N
        int[] arrNum = new int[inputNum];				// 자연수 N개 만큼 배열 생성
        String[] strNum = br.readLine().split(" ");		// 입력된 문자를 "" 만큼 String배열에 넣기
        int idx = 0;
        int temp = 0;									// 임시 값을 담는 곳
        String result = strNum[0] + " ";				// 최종 출력 값 (첫번째 값은 무조건 출력)


        //#1.받아온 문자열을 int 배열에 가공
        for(String s : strNum) {
            arrNum[idx] = Integer.parseInt(s);			// 받아온 문자를 int 형태로 변환하여 int 배열에 넣기
            idx++;
        }

        //#2.임시로 0번째 값 넣기
        temp = arrNum[0];

        //#3. 맥스값과 index 1번 부터 비교하기
        for(int i = 1 ; i < inputNum ; i++) {
            //#4. i번째 배열이 더 크면 : temp값 교체 후 출력
            if(temp < arrNum[i]) {
                temp = arrNum[i];
                result += arrNum[i] + " ";
            }else {
                //#5. i번째 배열이 더 작으면 : temp값만 교체
                temp = arrNum[i];
            }
        }

        //#6.최종 출력
        System.out.println(result);
    }

}

//[문제]
//N(1<=N<=100)개의 정수를 입력받아, 자신의 바로 앞 수보다 큰 수만 출력하는 프로그램을 작성하세요.(첫 번째 수는 무조건 출력한다)
//
//[입력]
//첫 줄에 자연수 N이 주어지고, 그 다음 줄에 N개의 정수가 입력된다.
//6
//7 3 9 5 6 1
//
//[출력]
//자신의 바로 앞 수보다 큰 수만 한 줄로 출력한다.
//7 9 6 12

