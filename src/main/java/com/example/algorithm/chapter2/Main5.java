package com.example.algorithm.chapter2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main5 {
    public static void main(String[] args) throws IOException {
        long start = System.currentTimeMillis();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        //#1.자연수 N이 입력
        int num = Integer.parseInt(reader.readLine());
        int cnt = 0;

        //#2.ArrayList 객체 생성 후 초기 세팅 2로 해줌
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(2);

        //#3.2 이상 부터 n 만큼 for구문
        for(int i = 2; i <= num ; i++) {
        	for(int j = 0;  j < arr.size(); j++) {
        		if(i%arr.get(j) == 0) break;
        		if(j == arr.size()- 1) arr.add(i);
        	}
        }
        System.out.println(arr.size());

        long end = System.currentTimeMillis();
        System.out.println("수행시간: " + (end - start) + " ms");

    }

}

//[문제]
//자연수 N이 입력되면 1부터 N까지의 소수의 개수를 출력하는 프로그램을 작성하세요.
//만약 20이 입력되면 1부터 20까지의 소수는 2, 3, 5, 7, 11, 13, 17, 19로 총 8개입니다. 제한시간은 1초입니다.

//[입력]
//첫 줄에 자연수의 개수 N(2<=N<=200,000)이 주어집니다.
//20

//[출력]
//첫 줄에 소수의 개수를 출력합니다.
//8
