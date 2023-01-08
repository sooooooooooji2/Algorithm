package com.example.algorithm.chapter3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main1 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int intNum1 = Integer.parseInt(br.readLine());         // 첫 번째 줄에 첫 번째 배열의 크기
        String[] intStr1  = br.readLine().split(" ");    // 두 번째 줄에 N개의 배열 원소가 오름차순으로 주어집니다.

        int intNum2 = Integer.parseInt(br.readLine());         // 세 번째 줄에 두 번째 배열의 크기
        String[] intStr2  = br.readLine().split(" ");    // 네 번째 줄에 N개의 배열 원소가 오름차순으로 주어집니다.

        ArrayList<Integer> result1 = solution(intNum1, intStr1);
        ArrayList<Integer> result2 = solution(intNum2, intStr2);

        result1.addAll(result2);
        Collections.sort(result1);

        for(int i = 0 ; i < result1.size(); i++){
            System.out.print(result1.get(i) + " ");
        }
    }

    static ArrayList<Integer> solution(int intNum, String[] arr){
        ArrayList<Integer> resultArr = new ArrayList<>();
        for (int i = 0 ; i < intNum ; i++){
            resultArr.add(Integer.parseInt(arr[i]));
        }

        return resultArr;
    }
}

//[문제]
//오름차순으로 정렬이 된 두 배열이 주어지면 두 배열을 오름차순으로 합쳐 출력하는 프로그램 을 작성하세요.
//
//[입력]
//첫 번째 줄에 첫 번째 배열의 크기 N(1<=N<=100)이 주어집니다. 두 번째 줄에 N개의 배열 원소가 오름차순으로 주어집니다.
//세 번째 줄에 두 번째 배열의 크기 M(1<=M<=100)이 주어집니다. 네 번째 줄에 M개의 배열 원소가 오름차순으로 주어집니다.
//각 리스트의 원소는 int형 변수의 크기를 넘지 않습니다.
//3
//1 3 5
//5
//2 3 6 7 9
//
//[출력]
//오름차순으로 정렬된 배열을 출력합니다.
//1 2 3 3 5 6 7 9