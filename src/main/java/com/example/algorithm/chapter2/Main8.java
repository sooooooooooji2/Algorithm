package com.example.algorithm.chapter2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main8 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int inNum = Integer.parseInt(br.readLine());   // N명의 학생 입력
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int[]arr = new int[inNum];  //N명의 학생들 점수를 담는 곳
        int idx = 0;

        while (st.hasMoreTokens()){
            arr[idx] = Integer.parseInt(st.nextToken());
            idx++;
        }

        arr = solution(inNum, arr);

        for(int i : arr){
            sb.append(i + " ");
        }

        System.out.println(sb.toString());
    }

    static int[] solution(int n, int[] arr){

        int[] rank = new int[n]; // n개의 수 만큼 등수담는 배열 생성
        for(int i=0; i<n; i++){
            int cnt=1;
            for(int j=0; j<arr.length; j++){
                if(arr[i]<arr[j]) cnt++;
            }
            rank[i]=cnt;
        }
        return rank;
    }
}

//[문제]
//N명의 학생의 국어점수가 입력되면 각 학생의 등수를 입력된 순서대로 출력하는 프로그램을 작성하세요.
//같은 점수가 입력될 경우 높은 등수로 동일 처리한다. 즉 가장 높은 점수가 92점인데 92점이 3명 존재하면 1등이 3명이고 그 다음 학생은 4등이 된다.
//
//[입력]
//첫 줄에 N(3<=N<=100)이 입력되고, 두 번째 줄에 국어점수를 의미하는 N개의 정수가 입력 된다.
//5
//87 89 92 100 76
//
//[출력]
//입력된 순서대로 등수를 출력한다.
//4 3 2 1 5