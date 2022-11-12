package com.example.algorithm.chapter2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int inputNum = Integer.parseInt(br.readLine()); // N명의 학생
        int[] arrNum = new int[inputNum];				// 학생 수 N개 만큼 배열 생성
        String[] strNum = br.readLine().split(" ");		// 입력된 문자를 "" 만큼 String배열에 넣기

        int idx = 0;
        int temp = 0;									// 임시 값을 담는 곳
        int cnt = 1;									// 최종 출력 값 (최대 학생 수)


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
                cnt++;
            }
        }

        //#6.최종 출력
        System.out.println(cnt);
    }

}

//[문제]
//선생님이 N명의 학생을 일렬로 세웠습니다. 일렬로 서 있는 학생의 키가 앞에서부터 순서대로 주어질 때,
//맨 앞에 서 있는 선생님이 볼 수 있는 학생의 수를 구하는 프로그램을 작성하세요.
//(어떤 학생이 자기 앞에 서 있는 학생들보다 크면 그 학생은 보이고, 작거나 같으면 보이지 않습니다.)

//[입력]
//첫 줄에 정수 N(5<=N<=100,000)이 입력된다. 그 다음줄에 N명의 학생의 키가 앞에서부터 순서대로 주어진다.
//8
//130 135 148 140 145 150 150 153
//
//[출력]
//선생님이 볼 수 있는 최대학생수를 출력한다.
//5