package com.example.algorithm.chapter2;

import java.io.IOException;
import java.util.Scanner;

public class Main9 {
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        int score = 0;

        int n = sc.nextInt();
        int[][] arr=new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                arr[i][j]= sc.nextInt();
            }
        }
        score = solution(n, arr);

        sb.append(score);
        System.out.println(sb.toString());
    }

    //00, 01, 02, 03, 04
    //10, 11, 12, 13, 14
    //20, 21, 22, 23, 24
    //30, 31, 32, 33, 34
    //40, 41, 42, 43, 44
    static int solution(int num, int[][] arr){
        int total , total2 ;
        int result = 0; // 최대 맥시멈값

        //#1. 가로, 세로 만큼 for구문 돌림
        for(int i = 0 ; i < num; i++){
            total = 0 ;
            total2 = 0;
            for(int j = 0 ; j < num ; j++){
                total += arr[i][j];  //가로행
                total2 += arr[j][i]; //세로열
            }
            result = Math.max(result, total);   //최대값 비교 후 넣기
            result = Math.max(result, total2);  //최대값 비교 후 넣기
        }

        //초기화
        total = 0 ;
        total2 = 0;
        //#2. 대각선 for구문 돌림
        // 00, 11, 22, 33, 44
        // 04, 13, 22, 31, 40
        for(int i = 0; i < num; i++){
            total += arr[i][i];
            total2 += arr[i][num-1-i];
        }
        result = Math.max(result, total);   //최대값 비교 후 넣기
        result = Math.max(result, total2);  //최대값 비교 후 넣기

        return result;
    }
}

//[문제]
//N*N의 격자판이 주어지면 각 행의 합, 각 열의 합, 두 대각선의 합 중 가 장 큰 합을 출력합 니다.

//[입력]
//첫 줄에 자연수 N이 주어진다.(2<=N<=50)
//두 번째 줄부터 N줄에 걸쳐 각 줄에 N개의 자연수가 주어진다. 각 자연수는 100을 넘지 않는 다.
//5
//10 13 10 12 15
//12 39 30 23 11
//11 25 50 53 15
//19 27 29 37 27
//19 13 30 13 19

//[출력]
//최대합을 출력합니다.
//155