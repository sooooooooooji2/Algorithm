package com.example.algorithm.chapter2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main6 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //#1.자연수 N이 입력받음
        int num = Integer.parseInt(reader.readLine());
        int[] arr = new int[num];
        int idx = 0;

        //#2.StringTokenizer 선언
        StringTokenizer st = new StringTokenizer(reader.readLine(), " ");

        //#3.arr배열 담기
        while(st.hasMoreTokens()) {
            arr[idx] = Integer.parseInt(st.nextToken());
            idx++;
        }

        //#4.데이터 뒤집기
        arr = arrReverse(arr);

        //#5.소수 찾은 후 출력
        arrCheck(arr);
    }

    //데이터 뒤집기
    public static int[] arrReverse(int[] arr){
        for(int i = 0 ; i < arr.length; i++){
           int tmp = arr[i];
           int res = 0;
           while(tmp>0){
                int t=tmp%10;
                res = res*10+t;
                tmp = tmp/10;
            }
           arr[i] = res;
        }
        return arr;
    }

    //소수 찾기
    public static void arrCheck(int[] arr){
        StringBuilder sb = new StringBuilder();

        for(int i : arr){
            if(i == 1) continue;        //break 문 하면 x
            if(i == 2) sb.append(i + " ");

            for(int j = 2 ; j < i ; j++){
                if(i % j == 0) break;
                if(j == i - 1) sb.append(i + " ");
            }
        }
        System.out.println(sb.toString());
    }
}

//[문제]
//N개의 자연수가 입력되면 각 자연수를 뒤집은 후 그 뒤집은 수가 소수이면 그 소수를 출력하 는 프로그램을 작성하세요.
//예를 들어 32를 뒤집으면 23이고, 23은 소수이다. 그러면 23을 출 력한다. 단 910를 뒤집으면 19로 숫자화 해야 한다.
//첫 자리부터의 연속된 0은 무시한다.
//
//[입력]
//첫 줄에 자연수의 개수 N(3<=N<=100)이 주어지고, 그 다음 줄에 N개의 자연수가 주어진다.
// 각 자연수의 크기는 100,000를 넘지 않는다.
//9
//32 55 62 20 250 370 200 30 100
//
//[출력]
//첫 줄에 뒤집은 소수를 출력합니다. 출력순서는 입력된 순서대로 출력합니다.
//23 2 73 2 3