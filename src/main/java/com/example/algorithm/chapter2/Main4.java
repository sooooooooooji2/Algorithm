package com.example.algorithm.chapter2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main4 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        //#1.입력받은 숫자(num) 크기 만큼 배열 생성
        int num = Integer.parseInt(reader.readLine());
        int[]arr = new int[num];

        //#2.array 0번째, 1번째 배열에 1값 미리 넣어주기
        arr[0] = 1;
        arr[1] = 1;

        //#3.array 0번째, 1번째 배열의 값을 StringBuilder에 담아두기
        sb.append(arr[0]);
        sb.append(' ');
        sb.append(arr[1]);

        //#4.피보나치 수열 계산
        for(int i = 2 ; i < num; i++){
            //#5.현재 인덱스 = 전 인덱스 + 전전인덱스
            arr[i] = arr[i-1] + arr[i-2];
            sb.append(' ');
            sb.append(arr[i]);
        }
        System.out.println(sb);
    }
}


//[문제]
//1)  피보나키 수열을 출력한다. 피보나치 수열이란 앞의 2개의 수를 합하여 다음 숫자가 되는 수열이다.
//2)  입력은 피보나치 수열의 총 항의 수 이다. 만약 7이 입력되면 1 1 2 3 5 8 13을 출력하면 된다.
//
//[입력]
//첫 줄에 총 항수 N(3<=N<=45)이 입력된다.
//10
//
//[출력]
//첫 줄에 피보나치 수열을 출력합니다.
//1 1 2 3 5 8 13 21 34 55